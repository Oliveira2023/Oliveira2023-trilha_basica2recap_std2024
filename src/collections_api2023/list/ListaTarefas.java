package collections_api2023.list;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefas {

    private List<Tarefa> tarefaList;

    public ListaTarefas() {
        this.tarefaList = new ArrayList<>();
    }

    public void adicionarTarefa(String descricao) {
        tarefaList.add(new Tarefa(descricao));
    }
    public void removerTarefa(String descricao) {
        List<Tarefa> tarefasParaRemover = new ArrayList<>();
        for (Tarefa tarefa : tarefaList) {
            if (tarefa.getDescricao().equalsIgnoreCase(descricao)) {
                tarefasParaRemover.add(tarefa);
            }
        }
        tarefaList.removeAll(tarefasParaRemover);
    }
    public int quantidadeTarefas() {
        return tarefaList.size();
    }
    public List<Tarefa> listarTarefas() {
        System.out.println("Listando tarefas:");
        for (Tarefa tarefa : tarefaList) {
            System.out.println(tarefa.getDescricao());
        }
        return tarefaList;
    }
}
