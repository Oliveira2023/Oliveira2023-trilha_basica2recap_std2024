package orientacao_objetos.polimorfismo.apps;

public abstract class ServicoMensagemInstantanea {

    public abstract void enviarMensagem(String mensagem);
    public abstract void salvarHistorico();
    protected void validarConexaoInternet() {
        System.out.println("Validando internet...");
    }

}
