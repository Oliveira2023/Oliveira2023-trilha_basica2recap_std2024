package collections_api2023.map.pesquisa;

import java.util.HashMap;
import java.util.Map;

public class EstoqueProdutos {

    private Map<Long, Produto> estoqueProdutosMap;

    public EstoqueProdutos() {
        this.estoqueProdutosMap = new HashMap<>();
    }

    public void adicionarProduto(Long codigo, String nome, double preco, int quantidade) {
        estoqueProdutosMap.put(codigo, new Produto(nome, preco, quantidade));
    }

    public void removerProduto(Long codigo) {
        if(!estoqueProdutosMap.isEmpty()){
            estoqueProdutosMap.remove(codigo);
        }
    }

    public void exibirProdutos() {
        System.out.println(estoqueProdutosMap);
    }

    public Produto pesquisarPorNome(String nome) {
        if(estoqueProdutosMap.isEmpty()){
            return null;
        }
        for (Produto produto : estoqueProdutosMap.values()) {
            if(produto.getNome().equals(nome)){
                return produto;
            }
        }
        return null;
    }

    public Double calcularValorTotalEstoque() {
        if(estoqueProdutosMap.isEmpty()){
            return 0.0;
        }
        double valorTotal = 0;
        for (Produto produto : estoqueProdutosMap.values()) {
            valorTotal += produto.getPreco() * produto.getQuantidade();
        }
        return valorTotal;
    }

    public Produto obterProdutoMaisCaro() {
        if(estoqueProdutosMap.isEmpty()){
            return null;
        }
        Produto produtoMaisCaro = null;
        double precoMaisCaro = 0;
        for (Produto produto : estoqueProdutosMap.values()) {
            if(produto.getPreco() > precoMaisCaro){
                precoMaisCaro = produto.getPreco();
                produtoMaisCaro = produto;
            }
        }
        return produtoMaisCaro;
    }

    public Produto obterProdutoMaisBarato() {
        if(estoqueProdutosMap.isEmpty()){
            return null;
        }
        Produto produtoMaisBarato = null;
        double precoMaisBarato = Double.MAX_VALUE;
        for (Produto produto : estoqueProdutosMap.values()) {
            if(produto.getPreco() < precoMaisBarato){
                precoMaisBarato = produto.getPreco();
                produtoMaisBarato = produto;
            }
        }
        return produtoMaisBarato;
    }

    public Produto obterProdutoMaiorQuantidadeValorTotalNoEstoque() {
        if(estoqueProdutosMap.isEmpty()){
            return null;
        }
        Produto produtoMaiorQuantidadeValorTotal = null;
        double maiorQuantidadeValorTotal = 0;
        for (Produto produto : estoqueProdutosMap.values()) {
            double quantidadeValorTotal = produto.getQuantidade() * produto.getPreco();
            if(quantidadeValorTotal > maiorQuantidadeValorTotal){
                maiorQuantidadeValorTotal = quantidadeValorTotal;
                produtoMaiorQuantidadeValorTotal = produto;
            }
        }
        return produtoMaiorQuantidadeValorTotal;
    }
}
