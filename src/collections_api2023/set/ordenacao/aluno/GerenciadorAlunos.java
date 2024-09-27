package collections_api2023.set.ordenacao.aluno;

import java.util.Set;
import java.util.TreeSet;

public class GerenciadorAlunos {
    private Set<Aluno> alunos;

    public GerenciadorAlunos() {
        this.alunos = new TreeSet<>();
    }

    public void adicionarAluno(long matricula, String nome, double media) {
        Aluno aluno = new Aluno(matricula, nome, media);
        if (alunos.contains(aluno)) {
            System.out.println("Aluno já cadastrado");
        } else {
            alunos.add(aluno);
            System.out.println("Aluno cadastrado com sucesso");
        }
    }

    public void removerAluno(long matricula) {

        for (Aluno aluno : alunos) {
            if (aluno.getMatricula() == matricula) {
                alunos.remove(aluno);
                System.out.println("Aluno removido com sucesso");
                return;
            }else {
                System.out.println("Aluno não encontrado");
            }
        }
    }

    public Set<Aluno> exibirAlunosPorNome() {
        Set<Aluno> alunosPorNome = new TreeSet<>(alunos);
        return alunosPorNome;
    }
    public Set<Aluno> exibirAlunosPorNota() {
        Set<Aluno> alunosPorNota = new TreeSet<>(new AlunosPorNota());
        alunosPorNota.addAll(alunos);
        return alunosPorNota;
    }
}
