package orientacao_objetos.heranca;

public abstract class Messeger {

    public void enviarMensagem(){
        validarConexao();
        System.out.println("Mensagem enviada com sucesso!");
        salvarHistorico();
    }
    public void receberMensagem(){
        validarConexao();
        System.out.println("Mensagem recebida com sucesso!");
        salvarHistorico();
    }
    private void validarConexao(){
        System.out.println("Conexão efetuada com sucesso!");
    }
    private void salvarHistorico(){
        System.out.println("Historico Salvado com sucesso!");
    }
}
