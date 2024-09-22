package collections_api2023.carrinho_compras;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoCompras {

    private List<ItemCompra> itens;

    public CarrinhoCompras() {
        this.itens = new ArrayList<ItemCompra>();
    }

    public void adicionarItem(String nome, double preco, int quantidade) {
        itens.add(new ItemCompra(nome, preco, quantidade));
    }

    public void removerItem(String nome) {
        List<ItemCompra> itensParaRemover = new ArrayList<ItemCompra>();
        if (itens.isEmpty()) {
            System.out.println("Carrinho vazio");
            return;
        }
        for (ItemCompra item : itens) {
            if (item.getNome().equals(nome)) {
                itensParaRemover.add(item);
            }
        }
        itens.removeAll(itensParaRemover);
    }

    public void exibirItens() {
        if (itens.isEmpty()) {
            System.out.println("Carrinho vazio");
            return;
        }
//        System.out.println(this.itens);
        for (ItemCompra item : itens) {
            System.out.println(item.getNome() + " Preço: " + item.getPreco() + " Quant: " + item.getQuantidade());
        }
    }

    public double calcularTotal() {
        double total = 0d;
        if (itens.isEmpty()) {
            throw new RuntimeException("Carrinho vazio");
        }
        for (ItemCompra item : itens) {
            total += item.getPreco() * item.getQuantidade();
        }
        return total;
    }
}
