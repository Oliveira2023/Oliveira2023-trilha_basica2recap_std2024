package orientacao_objetos.polimorfismo.apps;

public class MSNMesseger extends ServicoMensagemInstantanea {

    @Override
    public void enviarMensagem(String mensagem){
        validarConexaoInternet();
        System.out.println(mensagem);
    }

    @Override
    public void salvarHistorico() {

    }
}
