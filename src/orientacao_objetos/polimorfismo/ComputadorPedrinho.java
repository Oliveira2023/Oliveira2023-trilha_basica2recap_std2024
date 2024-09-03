package orientacao_objetos.polimorfismo;

import orientacao_objetos.polimorfismo.apps.FBMesseger;
import orientacao_objetos.polimorfismo.apps.MSNMesseger;
import orientacao_objetos.polimorfismo.apps.ServicoMensagemInstantanea;

import java.util.Scanner;

public class ComputadorPedrinho {
    public static void main(String[] args) {
        ServicoMensagemInstantanea smi = null;
        /*
        Não se sabe qual APP
        Mas qualquer um deverá enviar e receber mensagem
         */

        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o Aplicativo que deseja usar:");
        System.out.println("1: msn");
        System.out.println("2: FB");
//        System.out.println("");
        int opcao = entrada.nextInt();
        String appEscolhido;
        switch (opcao) {
            case 1: appEscolhido = "msn";
            break;
            case 2: appEscolhido = "FB";
            break;
            default: appEscolhido = "";
        }


        if (appEscolhido.equals("msn")) {
            smi = new MSNMesseger();
        } else if (appEscolhido.equals("FB")) {
            smi = new FBMesseger();
        }else {
            System.out.println("nenhum aplicativo escolhido");
            return;
        }
        System.out.println("Digite sua mensagem:");
        entrada.nextLine();
        String mensagem = entrada.nextLine();
        smi.enviarMensagem(mensagem);

    }
}
