package collections_api2023.set.pesquisa.agenda;

public class MainAgenda {

    public static void main(String[] args) {
        AgendaContato agenda = new AgendaContato();

        agenda.exibirContatos();

        agenda.addContato("Maria", 123456);
        agenda.addContato("João", 654321);
        agenda.addContato("Ana", 987654);
        agenda.addContato("José", 456789);
        agenda.addContato("Carlos", 987654);
        agenda.addContato("Ana Maria", 123456);

        agenda.exibirContatos();

        System.out.println("Pesquisa por nome: Ana");
        System.out.println(agenda.pesquisarPorNome("Ana"));

        System.out.println("Atualizar número de Ana para 111111");
        System.out.println(agenda.atualizarNumeroContato("Ana", 111111));

        agenda.exibirContatos();
    }
}
