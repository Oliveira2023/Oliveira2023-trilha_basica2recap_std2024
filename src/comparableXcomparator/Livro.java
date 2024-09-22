package comparableXcomparator;

public class Livro implements Comparable<Livro> {

    private String titulo;
    private String autor;
    private int ano;

    @Override
    public int compareTo(Livro l) {
        return this.titulo.compareTo(l.getTitulo());
    }

    public Livro(String titulo, String autor, int ano) {
        this.titulo = titulo;
        this.autor = autor;
        this.ano = ano;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getAno() {
        return ano;
    }

    @Override
    public String toString() {
        return "[autor=" + autor + ", ano=" + ano + ", titulo=" + titulo + "]\n";
    }
}
