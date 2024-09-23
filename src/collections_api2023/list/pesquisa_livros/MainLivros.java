package collections_api2023.list.pesquisa_livros;

public class MainLivros {

    public static void main(String[] args) {
        CatalogoLivros catalogo = new CatalogoLivros();

        catalogo.adicionarLivro("Livro 1", "Autor 1", 2015);
        catalogo.adicionarLivro("Livro 2", "Autor 2", 2016);
        catalogo.adicionarLivro("Livro 3", "Autor 1", 2017);
        catalogo.adicionarLivro("Livro 4", "Autor 3", 2018);
        catalogo.adicionarLivro("Livro 5", "Autor 2", 2019);

        System.out.println("Livros do autor 1:");
        catalogo.pesquisarPorAutor("Autor 1").forEach(System.out::println);

        System.out.println(catalogo.pesquisarPorIntervaloAnos(2016, 2017));

        System.out.println(catalogo.pesquisarPorTitulo("Livro 3"));

    }
}
