package collections_api2023.set.pesquisa.tarefas;

import java.util.HashSet;
import java.util.Set;

public class ListaTarefas {
    private Set<Tarefa> tarefas;

    public ListaTarefas() {
        this.tarefas = new HashSet<>();
    }

    public void adicionarTarefa(Tarefa tarefa) {
        this.tarefas.add(tarefa);
    }
    public void removerTarefa(String descricao) {
        this.tarefas.removeIf(tarefa -> tarefa.getDescricao().equalsIgnoreCase(descricao));
    }
    public void exibirTarefas() {
        this.tarefas.forEach(System.out::println);
    }
    public int contarTarefas() {
        return this.tarefas.size();
    }
    public Set<Tarefa> obterTarefasConcluidas() {
        Set<Tarefa> tarefasConcluidas = new HashSet<>();
        for (Tarefa tarefa : this.tarefas) {
            if (tarefa.isConcluida()) {
                tarefasConcluidas.add(tarefa);
            }
        }
        return tarefasConcluidas;
    }
    public Set<Tarefa> obterTarefasNaoConcluidas() {
        Set<Tarefa> tarefasNaoConcluidas = new HashSet<>();
        for (Tarefa tarefa : this.tarefas) {
            if (!tarefa.isConcluida()) {
                tarefasNaoConcluidas.add(tarefa);
            }
        }
        return tarefasNaoConcluidas;
    }
    public void concluirTarefa(String descricao) {
        for (Tarefa tarefa : this.tarefas) {
            if (tarefa.getDescricao().equalsIgnoreCase(descricao)) {
                tarefa.setConcluida(true);
            }
        }
    }
    public void marcarTarefaPendente(String descricao) {
        for (Tarefa tarefa : this.tarefas) {
            if (tarefa.getDescricao().equalsIgnoreCase(descricao)) {
                tarefa.setConcluida(false);
            }
        }
    }
    public void limparTarefas() {
        this.tarefas.clear();
    }
}
