package interfaces.iphone;

public class SamsungA20 implements Telefone, Navegador, ReprodutorMusical {
    public void ligar() {
        System.out.println("Ligando...");
    }

    public void atender() {
        System.out.println("Atendendo...");
    }

    public void desligar() {
        System.out.println("Desligando...");
    }

    public void correioVoz() {
        System.out.println("Correio de voz...");
    }

    public void abrirPagina(String url) {
        System.out.println("Abrindo página: " + url);
    }

    public void atualizar() {
        System.out.println("Atualizando...");
    }

    public void novaAba() {
        System.out.println("Nova aba...");
    }

    public void sair() {
        System.out.println("Saindo...");
    }

    public void tocar() {
        System.out.println("Tocando...");
    }

    public void pausar() {
        System.out.println("Pausando...");
    }

    public void selecionarMusica() {
        System.out.println("Selecionando música...");
    }
}
