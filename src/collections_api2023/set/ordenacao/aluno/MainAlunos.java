package collections_api2023.set.ordenacao.aluno;

import java.util.Set;

public class MainAlunos {

    public static void main(String[] args) {
        GerenciadorAlunos gerenciador = new GerenciadorAlunos();
        gerenciador.adicionarAluno(123, "Maria", 8.5);
        gerenciador.adicionarAluno(124, "João", 7.5);
        gerenciador.adicionarAluno(125, "Ana", 9.0);
        gerenciador.adicionarAluno(126, "Pedro", 6.5);
        gerenciador.adicionarAluno(127, "Carlos", 7.0);
        gerenciador.adicionarAluno(128, "Marta", 8.0);
        gerenciador.adicionarAluno(129, "Paulo", 9.5);
        gerenciador.adicionarAluno(130, "Lucas", 6.0);
        gerenciador.adicionarAluno(131, "Julia", 7.5);
//        gerenciador.adicionarAluno(132, "Fernanda", 8.5);
//        gerenciador.adicionarAluno(133, "Ricardo", 9.0);
//        gerenciador.adicionarAluno(134, "Sandra", 6.5);
//        gerenciador.adicionarAluno(135, "Marcos", 7.0);
//        gerenciador.adicionarAluno(136, "Cristina", 8.0);
//        gerenciador.adicionarAluno(137, "Roberto", 9.5);
//        gerenciador.adicionarAluno(138, "Carla", 6.0);
//        gerenciador.adicionarAluno(139, "Fernando", 7.5);
//        gerenciador.adicionarAluno(140, "Mariana", 8.5);
//        gerenciador.adicionarAluno(141, "Rafael", 9.0);
//        gerenciador.adicionarAluno(142, "Sonia", 6.5);
//        gerenciador.adicionarAluno(143, "Eduardo", 7.0);
//        gerenciador.adicionarAluno(144, "Tatiana", 8.0);
//        gerenciador.adicionarAluno(145, "Vitor", 9.5);

        gerenciador.exibirAlunosPorNome().forEach(System.out::println);

        gerenciador.removerAluno(125);

        System.out.println("Após remoção:");
        gerenciador.exibirAlunosPorNome().forEach(System.out::println);

        System.out.println("Alunos por nota:");
        gerenciador.exibirAlunosPorNota().forEach(System.out::println);

    }

}
