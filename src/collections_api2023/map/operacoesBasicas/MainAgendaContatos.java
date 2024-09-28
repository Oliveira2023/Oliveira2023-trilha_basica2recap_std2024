package collections_api2023.map.operacoesBasicas;

public class MainAgendaContatos {

    public static void main(String[] args) {
        AgendaContatos agenda = new AgendaContatos();
        agenda.adicionarContato("Maria", 123456789);
        agenda.adicionarContato("João", 987654321);
        agenda.adicionarContato("Ana", 456789123);
        agenda.exibirContatos();
        agenda.removerContato("Maria");
        agenda.exibirContatos();
        System.out.println(agenda.pesquisarPorNome("Ana"));
    }
}
