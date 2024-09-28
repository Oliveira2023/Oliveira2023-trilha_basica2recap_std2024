package collections_api2023.map.operacoesBasicas;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {

    private Map<String, Integer> agendaContatoMap;

    public AgendaContatos() {
        this.agendaContatoMap = new HashMap<>();
    }

    public void adicionarContato(String nome, Integer telefone) {
        agendaContatoMap.put(nome, telefone);
    }

    public void removerContato(String nome) {
        if(!agendaContatoMap.isEmpty()){
            agendaContatoMap.remove(nome);
        }
    }
    public void exibirContatos() {
        System.out.println(agendaContatoMap);
    }

    public Integer pesquisarPorNome(String nome) {
        if(agendaContatoMap.isEmpty()){
            return null;
        }
        return agendaContatoMap.get(nome);
    }

}
