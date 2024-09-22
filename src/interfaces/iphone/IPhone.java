package interfaces.iphone;

public class IPhone implements ReprodutorMusical, Telefone, Navegador{


    @Override
    public void abrirPagina(String url) {
        System.out.println("Abrindo página: " + url);
    }

    @Override
    public void atualizar() {
        System.out.println("Atualizando página");
    }

    @Override
    public void novaAba() {
        System.out.println("Abrindo nova aba");
    }

    @Override
    public void sair() {
        System.out.println("Saindo do navegador");
    }

    @Override
    public void tocar() {
        System.out.println("Tocando música");
    }

    @Override
    public void pausar() {
        System.out.println("Pausando música");
    }

    @Override
    public void selecionarMusica() {
        System.out.println("Selecionando música");
    }

    @Override
    public void ligar() {
        System.out.println("Ligando telefone");
    }

    @Override
    public void atender() {
        System.out.println("Atendendo telefone");
    }

    @Override
    public void desligar() {
        System.out.println("Desligando telefone");
    }

    @Override
    public void correioVoz() {
        System.out.println("Correio de voz");
    }
}
