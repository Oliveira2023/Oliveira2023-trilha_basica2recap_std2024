package collections_api2023.list.pesquisa_livros;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {
    private List<Livro> livroList;

    public CatalogoLivros() {
        this.livroList = new ArrayList<>();
    }

    public void adicionarLivro(String titulo, String autor, int anoPublicacao) {
        livroList.add(new Livro(titulo, autor, anoPublicacao));
    }
    public List<Livro> pesquisarPorAutor(String autor) {
        List<Livro> livrosPorAutor = new ArrayList<>();
        if (!livroList.isEmpty()){
            for (Livro livro : livroList) {
                if (livro.getAutor().equalsIgnoreCase(autor)) {
                    livrosPorAutor.add(livro);
                }
            }
        }
        return livrosPorAutor;
    }
    public List<Livro> pesquisarPorIntervaloAnos(int anoInicio, int anoFim) {
        List<Livro> livrosPorIntervalo = new ArrayList<>();
        if (!livroList.isEmpty()){
            for (Livro livro : livroList) {
                if (livro.getAnoPublicacao() >= anoInicio && livro.getAnoPublicacao() <= anoFim) {
                    livrosPorIntervalo.add(livro);
                }
            }
        }
        return livrosPorIntervalo;
    }
    public Livro pesquisarPorTitulo(String titulo) {
        if (!livroList.isEmpty()){
            for (Livro livro : livroList) {
                if (livro.getTitulo().equalsIgnoreCase(titulo)) {
                    return livro;
                }
            }
        }
        return null;
    }
}
