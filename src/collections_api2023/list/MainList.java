package collections_api2023.list;

public class MainList {

    public static void main(String[] args) {
        ListaTarefas MinhasTarefas = new ListaTarefas();
        MinhasTarefas.adicionarTarefa("Estudar Java");
        MinhasTarefas.adicionarTarefa("Revisar");
        MinhasTarefas.adicionarTarefa("Fazer exercícios");
        MinhasTarefas.adicionarTarefa("Estudar Java");

        MinhasTarefas.listarTarefas();
        System.out.println("total de tarefas:");
        System.out.println(MinhasTarefas.quantidadeTarefas());

        System.out.println("Removendo tarefa Estudar Java");
        MinhasTarefas.removerTarefa("Estudar Java");
        System.out.println(MinhasTarefas.quantidadeTarefas());



    }
}
