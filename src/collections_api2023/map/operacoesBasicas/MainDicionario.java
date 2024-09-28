package collections_api2023.map.operacoesBasicas;

public class MainDicionario {

    public static void main(String[] args) {
        Dicionario dicionario = new Dicionario();
        dicionario.adicionarPalavra("Casa", "Lugar onde se mora");
        dicionario.adicionarPalavra("Carro", "Meio de transporte");
        dicionario.adicionarPalavra("Computador", "Máquina que processa dados");
        dicionario.exibirPalavras();
        dicionario.removerPalavra("Casa");
        dicionario.exibirPalavras();
        System.out.println(dicionario.pesquisarPorPalavra("Carro"));
    }
}
