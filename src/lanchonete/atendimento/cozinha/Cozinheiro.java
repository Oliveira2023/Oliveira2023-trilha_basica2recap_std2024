package lanchonete.atendimento.cozinha;

import lanchonete.atendimento.Atendente;

public class Cozinheiro {
    public void adicionarLancheNoBalcao(){
        System.out.println("Adicionando no balcao");
    }
    public void adicionarSucoNoBalcao() {
        System.out.println("Adicionando suco no balcao");
    }
    public void adicionarComboNoBalcao(){
        System.out.println("Adicionando combo no balcao");
    }
    private void prepararLanche() {
        System.out.println("Preparando lanche tipo hamburger");
    }
    private void prepararVitamina() {
        System.out.println("Selecionando Fruta, leite e suco");
    }
    private void baterVitaminaLiquidificador() {
        System.out.println("Batendo vitamina");
    }
    private void lavarIngredientes() {
        System.out.println("Lavando ingredientes");
    }
    private void selecionarIngredientesVitamina(){
        System.out.println("Selecionando ingredientes da vitamina");
    }
    private void fritarIngredientesLanche(){
        System.out.println("Fritando a carne e ovo para o hamburger");
    }

    private void pedirIngredientes(Almoxarife almoxarife) {
        almoxarife.entregarIngredientes();
    }
    private void pedirParaTrocarGas(Almoxarife almoxarife) {
        almoxarife.trocarGas();
    }


}
