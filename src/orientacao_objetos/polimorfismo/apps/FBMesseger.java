package orientacao_objetos.polimorfismo.apps;

public class FBMesseger extends ServicoMensagemInstantanea {
    @Override
    public void enviarMensagem(String mensagem) {
        validarConexaoInternet();
        System.out.println("Você está enviando a seguinte mensagem pelo FB:");
        System.out.println(mensagem);
    }

    @Override
    public void salvarHistorico() {

    }
}
