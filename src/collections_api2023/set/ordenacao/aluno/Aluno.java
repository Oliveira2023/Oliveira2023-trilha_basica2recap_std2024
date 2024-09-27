package collections_api2023.set.ordenacao.aluno;

public class Aluno implements Comparable<Aluno> {
    private long matricula;

    private String nome;
    private double media;
    public Aluno(long matricula, String nome, double media) {
        this.matricula = matricula;
        this.nome = nome;
        this.media = media;
    }

    @Override
    public int compareTo(Aluno a) {
        return this.nome.compareTo(a.getNome());
    }

    public long getMatricula() {
        return matricula;
    }

    public String getNome() {
        return nome;
    }

    public double getMedia() {
        return media;
    }

    @Override
    public String toString() {
        return "matricula=" + matricula +
                ", nome='" + nome + '\'' +
                ", media=" + media;
    }
}
