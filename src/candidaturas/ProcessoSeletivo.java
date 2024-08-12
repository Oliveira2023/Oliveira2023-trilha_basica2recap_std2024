package candidaturas;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ProcessoSeletivo {
    static int candidatosSelecionados = 0;
    static List<String> candidatosSelecParaContato = new ArrayList<>();

    public static void main(String[] args) {

        selecaoCandidatos();
        System.out.println(candidatosSelecParaContato);
        for (String candidato : candidatosSelecParaContato) {
            entrandoEmContato(candidato);
        }
        boolean testeBoolean = new Random().nextBoolean();
//        for (int i = 0; i < 5; i++) {
//            System.out.println(new Random().nextBoolean());
//        }

    }

    static void selecaoCandidatos(){
        String[] candidatos = {"A", "B", "C", "D", "E", "F", "G", "H"};
        Random gerador = new Random();

        for (String candidato:candidatos){
            if(candidatosSelecionados > 4) break;
            int pretensao = gerador.nextInt(1200,2200);
//            System.out.println(candidato + "pretensão: " + pretensao);

            analisarCandidato(pretensao, candidato);


        }

    }
    static void analisarCandidato(double salarioPretendido, String candidato){
        double salarioBase = 2000.0;
        if (salarioPretendido < salarioBase){
            System.out.println("Ligar para o Candidato " + candidato + " com pretensão: " + salarioPretendido);
            candidatosSelecionados++;
            candidatosSelecParaContato.add(candidato);
        } else if (salarioPretendido == salarioBase) {
            System.out.println("Contra proposta, candidato: " + candidato + " pretensão: " + salarioPretendido);
            candidatosSelecionados++;
            candidatosSelecParaContato.add(candidato);
        }else {
            System.out.println("Aguardando o resultado dos demais candidatos, candidato: " + candidato + ", salarioPretendido: " + salarioPretendido);
        }
    }
    static void entrandoEmContato(String candidato){
        int tentativas = 0;
        boolean continuarTentando = true;

        do {

            System.out.println("Chamando candidato " + candidato);
            tentativas++;
            if (new Random().nextBoolean()) continuarTentando = false;
            if (!continuarTentando) System.out.println("Contato realizado com Sucesso");
        }while(continuarTentando && tentativas < 3);

    }
}
