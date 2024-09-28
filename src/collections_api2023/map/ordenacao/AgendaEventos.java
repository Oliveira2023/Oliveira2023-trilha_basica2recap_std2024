package collections_api2023.map.ordenacao;

import java.time.LocalDate;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class AgendaEventos {
    private Map<LocalDate, Evento> agendaEventosMap;

    public AgendaEventos() {
        this.agendaEventosMap = new HashMap<>();
    }

    public void adicionarEvento(LocalDate data, String nome, String atracao) {
        agendaEventosMap.put(data, new Evento(nome, atracao));
    }
    public void exibirAgenda() {
        Map<LocalDate, Evento> eventosTreeMap = new TreeMap<>(agendaEventosMap);
        System.out.println(eventosTreeMap);
    }
    public void obterProximoEvento() {
        if (agendaEventosMap.isEmpty()) {
            System.out.println("Agenda vazia");
            return;
        }
        LocalDate dataProximoEvento = null;
        Evento proximoEvento = null;
        LocalDate dataAtual = LocalDate.now();
        Map<LocalDate, Evento> eventosTreeMap = new TreeMap<>(agendaEventosMap);
        for (Map.Entry<LocalDate, Evento> entry : eventosTreeMap.entrySet()) {
            if (entry.getKey().isEqual(dataAtual) || entry.getKey().isAfter(dataAtual)) {
                dataProximoEvento = entry.getKey();
                proximoEvento = entry.getValue();
                break;
            }
        }
        System.out.println("Próximo evento: ");
        System.out.println(dataProximoEvento + " - " + proximoEvento);
    }
}
