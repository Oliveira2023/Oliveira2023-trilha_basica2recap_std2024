package collections_api2023.set.ordenacao.produto;

public class MainProdutos {

    public static void main(String[] args) {
        CadastroProdutos cadastro = new CadastroProdutos();

        cadastro.adicionarProduto(1, "Arroz", 10.0, 100);
        cadastro.adicionarProduto(2, "Feijão", 8.0, 50);
        cadastro.adicionarProduto(3, "Macarrão", 5.0, 200);
        cadastro.adicionarProduto(4, "Óleo", 15.0, 30);
        cadastro.adicionarProduto(5, "Sal", 2.0, 100);
        cadastro.adicionarProduto(6, "Açúcar", 3.0, 80);
        cadastro.adicionarProduto(7, "Café", 7.0, 40);
        cadastro.adicionarProduto(8, "Farinha", 4.0, 70);
        cadastro.adicionarProduto(9, "Leite", 6.0, 60);
        cadastro.adicionarProduto(10, "Biscoito", 2.5, 90);

        System.out.println("Produtos por nome:");
        cadastro.exibirProdutosPorNome().forEach(System.out::println);

        System.out.println("\nProdutos por preço:");
        cadastro.exibirProdutosPorPreco().forEach(System.out::println);
    }
}
