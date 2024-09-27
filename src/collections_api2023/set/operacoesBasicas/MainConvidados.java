package collections_api2023.set.operacoesBasicas;

public class MainConvidados {

    public static void main(String[] args) {

        ConjuntoConvidado conjuntoConvidado = new ConjuntoConvidado();

        System.out.println("Existem " + conjuntoConvidado.contarConvidados() + " convidados.");

        conjuntoConvidado.setConvidados("João", 1);
        conjuntoConvidado.setConvidados("Maria", 2);
        conjuntoConvidado.setConvidados("Ana", 3);
        conjuntoConvidado.setConvidados("Pedro", 4);
        conjuntoConvidado.setConvidados("Maria 2", 2);

        System.out.println("Existem " + conjuntoConvidado.contarConvidados() + " convidados.");

        System.out.println("Lista de convidados:");
        conjuntoConvidado.exibirConvidados();

        conjuntoConvidado.removerConvidadoPorCodigo(3);
        conjuntoConvidado.exibirConvidados();



    }
}
