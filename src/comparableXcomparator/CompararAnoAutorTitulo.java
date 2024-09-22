package comparableXcomparator;

public class CompararAnoAutorTitulo implements java.util.Comparator<Livro> {
    @Override
    public int compare(Livro l1, Livro l2) {
        if (l1.getAno() != l2.getAno()) {
            return l1.getAno() - l2.getAno();
        } else if (!l1.getAutor().equals(l2.getAutor())) {
            return l1.getAutor().compareTo(l2.getAutor());
        } else {
            return l1.getTitulo().compareTo(l2.getTitulo());
        }
    }
}
