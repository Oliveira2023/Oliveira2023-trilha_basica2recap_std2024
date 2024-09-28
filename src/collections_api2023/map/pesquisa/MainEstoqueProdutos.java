package collections_api2023.map.pesquisa;

public class MainEstoqueProdutos {


    public static void main(String[] args) {
        EstoqueProdutos estoqueProdutos = new EstoqueProdutos();
        estoqueProdutos.adicionarProduto(1L, "Arroz", 10.0, 5);
        estoqueProdutos.adicionarProduto(2L, "Feijão", 8.0, 3);
        estoqueProdutos.adicionarProduto(3L, "Macarrão", 5.0, 2);
        estoqueProdutos.adicionarProduto(4L, "Óleo", 7.0, 4);
        estoqueProdutos.adicionarProduto(5L, "Sal", 2.0, 1);
        estoqueProdutos.adicionarProduto(6L, "Açai", 33.0, 2);

        estoqueProdutos.exibirProdutos();

        System.out.println("Valor total do estoque: " + estoqueProdutos.calcularValorTotalEstoque());

        System.out.println("Produto mais caro: " + estoqueProdutos.obterProdutoMaisCaro());

        System.out.println("Pesquisar por nome: " + estoqueProdutos.pesquisarPorNome("Arroz"));

        System.out.println("Produto de maior Valor estocado: " +
                estoqueProdutos.obterProdutoMaiorQuantidadeValorTotalNoEstoque());

    }
}
