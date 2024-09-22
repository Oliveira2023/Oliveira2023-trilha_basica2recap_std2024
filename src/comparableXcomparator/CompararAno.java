package comparableXcomparator;

public class CompararAno implements java.util.Comparator<Livro> {
    @Override
    public int compare(Livro l1, Livro l2) {
        return l1.getAno() - l2.getAno();
    }
}
