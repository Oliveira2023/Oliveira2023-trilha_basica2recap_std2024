package comparableXcomparator;

import java.util.ArrayList;
import java.util.Collections;

public class MainLivro {

    public static void main(String[] args) {
        Livro l1 = new Livro("Bava Como Programar", "Adoulf", 2015);
        Livro l2 = new Livro("Cython sem mistérios", "Adoulf", 2015);
        Livro l3 = new Livro("Avascript para web", "Bernardo", 2020);

        ArrayList<Livro> livros = new ArrayList<Livro>();
        livros.add(l1);
        livros.add(l2);
        livros.add(l3);

        System.out.println(livros);

//        ordenação definida na classe Livro
        Collections.sort(livros);
        for (Livro livro : livros) {
            System.out.println(livro.getTitulo() + " - " +
                    livro.getAutor() + " - " +
                    livro.getAno());
        }
        System.out.println("====================================");
        System.out.println("Ordenação por autor");
        Collections.sort(livros, new CompararAutor());
        for (Livro livro : livros) {
            System.out.println(livro.getTitulo() + " - " +
                    livro.getAutor() + " - " +
                    livro.getAno());
        }

        System.out.println("====================================");
        System.out.println("Ordenação por ano:");
        Collections.sort(livros, new CompararAno());
        for (Livro livro : livros) {
            System.out.println(livro.getTitulo() + " - " +
                    livro.getAutor() + " - " +
                    livro.getAno());
        }

    }
}
