package collections_api2023.set.pesquisa.tarefas;

public class MainTarefas {

    public static void main(String[] args) {
        ListaTarefas listaTarefas = new ListaTarefas();

        listaTarefas.adicionarTarefa(new Tarefa("Estudar Java"));
        listaTarefas.adicionarTarefa(new Tarefa("Estudar Spring Boot"));
        listaTarefas.adicionarTarefa(new Tarefa("Estudar Spring Data JPA"));
        listaTarefas.adicionarTarefa(new Tarefa("Estudar Spring Security"));
        listaTarefas.adicionarTarefa(new Tarefa("Estudar Spring MVC"));

//        listaTarefas.exibirTarefas();
        listaTarefas.concluirTarefa("Estudar Spring Boot");
        listaTarefas.removerTarefa("Estudar Spring Data JPA");
        listaTarefas.exibirTarefas();
        System.out.println(listaTarefas.contarTarefas());
        listaTarefas.obterTarefasConcluidas().forEach(System.out::println);
        System.out.println("\nTarefas não concluídas");
        listaTarefas.obterTarefasNaoConcluidas().forEach(System.out::println);
        System.out.println("\nMarcar tarefa pendente");
        listaTarefas.marcarTarefaPendente("Estudar Spring Boot");
        listaTarefas.obterTarefasNaoConcluidas().forEach(System.out::println);

        System.out.println("\nLimpar tarefas");
        listaTarefas.limparTarefas();
        listaTarefas.exibirTarefas();
    }
}
