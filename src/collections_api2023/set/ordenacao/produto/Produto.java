package collections_api2023.set.ordenacao.produto;

import java.util.Objects;

public class Produto implements Comparable<Produto> {
    private long codigo;

    private String nome;
    private double preco;
    private int quantidade;
    public Produto(long codigo, String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.codigo = codigo;
        this.quantidade = quantidade;
    }

    @Override
    public int compareTo(Produto p) {
        return nome.compareToIgnoreCase(p.getNome());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Produto produto)) return false;
        return getCodigo() == produto.getCodigo();
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getCodigo());
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public long getCodigo() {
        return codigo;
    }

    public int getQuantidade() {
        return quantidade;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "nome='" + nome + '\'' +
                ", preco=" + preco +
                ", codigo=" + codigo +
                ", quantidade=" + quantidade +
                '}';
    }
}
