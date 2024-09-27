package collections_api2023.set.pesquisa.agenda;

import java.util.HashSet;
import java.util.Set;

public class AgendaContato {
    private Set<Contato> contatos;

    public AgendaContato() {
        this.contatos = new HashSet<>();
    }

    public void addContato(String nome, int numero) {
        this.contatos.add(new Contato(nome, numero));
    }

    public void exibirContatos() {
        System.out.println("Contatos:");
        System.out.println(contatos);
    }

    public Set<Contato> pesquisarPorNome(String nome) {
        Set<Contato> contatosPorNome = new HashSet<>();
        for (Contato contato : contatos) {
            if (contato.getNome().startsWith(nome)) {
                contatosPorNome.add(contato);
            }
        }
        return contatosPorNome;
    }

    public Contato pesquisarContato(String nome) {
        for (Contato contato : contatos) {
            if (contato.getNome().equals(nome)) {
                return contato;
            }
        }
        return null;
    }

    public Contato atualizarNumeroContato(String nome, int novoNumero) {
        Contato contatoAtualizao = null;
        for (Contato contato : contatos) {
            if (contato.getNome().equalsIgnoreCase(nome)) {
                contato.setNumero(novoNumero);
                contatoAtualizao = contato;
                break;
            }
        }
        return contatoAtualizao;
    }

    public Set<Contato> getContatos() {
        return contatos;
    }
}
