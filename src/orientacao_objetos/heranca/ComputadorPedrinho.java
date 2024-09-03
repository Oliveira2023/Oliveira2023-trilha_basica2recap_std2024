package orientacao_objetos.heranca;

public class ComputadorPedrinho {

    public static void main(String[] args) {
        FbMesseger fb = new FbMesseger();
        fb.enviarMensagem();
//        fb.receberMensagem();

        MSNMesseger msn = new MSNMesseger();
        msn.enviarMensagem();
    }
}
