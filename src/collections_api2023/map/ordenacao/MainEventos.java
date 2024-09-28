package collections_api2023.map.ordenacao;

import java.time.LocalDate;

public class MainEventos {
    public static void main(String[] args) {
        AgendaEventos agendaEventos = new AgendaEventos();
        agendaEventos.adicionarEvento(LocalDate.parse("2024-10-10"), "Show de Rock", "Banda X");
        agendaEventos.adicionarEvento(LocalDate.parse("2024-10-15"), "Show de MPB", "Cantor Y");
        agendaEventos.adicionarEvento(LocalDate.parse("2024-10-20"), "Show de Samba", "Grupo Z");
        agendaEventos.adicionarEvento(LocalDate.parse("2024-10-25"), "Show de Forró", "Banda W");
        agendaEventos.adicionarEvento(LocalDate.parse("2024-09-30"), "Show de Pagode", "Grupo V");

        agendaEventos.exibirAgenda();

        agendaEventos.obterProximoEvento();
    }
}
