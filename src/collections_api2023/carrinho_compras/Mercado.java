package collections_api2023.carrinho_compras;

public class Mercado {

    public static void main(String[] args) {
        CarrinhoCompras carrinho = new CarrinhoCompras();
        carrinho.adicionarItem("Arroz", 10.0, 2);
        carrinho.adicionarItem("Feijão", 5.0, 1);
        carrinho.adicionarItem("Macarrão", 3.0, 3);
        carrinho.adicionarItem("Carne", 20.0, 1);
        carrinho.adicionarItem("Frango", 15.0, 2);
        carrinho.adicionarItem("Peixe", 25.0, 1);
        carrinho.adicionarItem("Ovo", 0.5, 12);

        carrinho.exibirItens();
        System.out.println("Total: " + carrinho.calcularTotal());

        carrinho.removerItem("Macarrão");
        carrinho.removerItem("Ovo");
        carrinho.exibirItens();
        System.out.println("Total: " + carrinho.calcularTotal());
    }
}
