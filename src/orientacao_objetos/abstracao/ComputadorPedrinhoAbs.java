package orientacao_objetos.abstracao;

public class ComputadorPedrinhoAbs {

    public static void main(String[] args) {
        FBMesseger fb = new FBMesseger();
        fb.enviarMensagem();

        MSNMesseger msn = new MSNMesseger();
        msn.enviarMensagem();
    }
}
