package collections_api2023.set.operacoesBasicas;

public class MainPalavrasUnicas {

    public static void main(String[] args) {
        ConjuntoPalavrasunicas conjuntoPalavrasunicas = new ConjuntoPalavrasunicas();

        System.out.println("Existem " + conjuntoPalavrasunicas.contarPalavras() + " palavras.");

        conjuntoPalavrasunicas.adicionarPalavra("João");
        conjuntoPalavrasunicas.adicionarPalavra("Maria");
        conjuntoPalavrasunicas.adicionarPalavra("Ana");
        conjuntoPalavrasunicas.adicionarPalavra("Pedro");
        conjuntoPalavrasunicas.adicionarPalavra("Maria");

        System.out.println("Existem " + conjuntoPalavrasunicas.contarPalavras() + " palavras.");

        System.out.println("Lista de palavras:");
        conjuntoPalavrasunicas.exibirPalavras();

        conjuntoPalavrasunicas.removerPalavra("Ana");
        conjuntoPalavrasunicas.exibirPalavras();

        System.out.println("A palavra 'Maria' está presente? " + conjuntoPalavrasunicas.verificarPalavra("Maria"));
        System.out.println("A palavra 'Ana' está presente? " + conjuntoPalavrasunicas.verificarPalavra("Ana"));
    }
}
