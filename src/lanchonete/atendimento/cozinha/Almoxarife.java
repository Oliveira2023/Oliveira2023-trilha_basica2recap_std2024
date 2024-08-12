package lanchonete.atendimento.cozinha;

public class Almoxarife {
    private void controlarEntrada() {
        System.out.println("controlando entrada dos items");
    }
    private void controlarSaida() {
        System.out.println("controlando saida dos items");
    }
    void entregarIngredientes() {
        System.out.println("Entregando ingredientes solicitados.");
        controlarSaida();
    }
    void trocarGas(){
        System.out.println("Almoxarife - Trocando Gas");
    }
}
