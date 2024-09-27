package collections_api2023.set.ordenacao.produto;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProdutos {
    private Set<Produto> produtos;

    public CadastroProdutos() {
        this.produtos = new HashSet<>();
    }

    public void adicionarProduto(long cod, String nome, double preco, int qtd) {
        Produto produto = new Produto(cod, nome, preco, qtd);
        if (produtos.contains(produto)) {
            System.out.println("Produto já cadastrado");
        } else {
            produtos.add(produto);
            System.out.println("Produto cadastrado com sucesso");
        }
    }
    public Set<Produto> exibirProdutosPorNome() {
        Set<Produto> produtosPorNome = new TreeSet<>(produtos);
        return produtosPorNome;
    }
    public Set<Produto> exibirProdutosPorPreco() {
        Set<Produto> produtosPorPreco = new TreeSet<>(new ComparatorPorPreco());
        produtosPorPreco.addAll(produtos);
        return produtosPorPreco;
    }


}
