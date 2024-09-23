package collections_api2023.list.soma_numeros;

public class MainNumeros {
    public static void main(String[] args) {
        SomaNumeros soma = new SomaNumeros();
        soma.adicionarNumero(1);
        soma.adicionarNumero(2);
        soma.adicionarNumero(3);
        System.out.println(soma);
        System.out.println("Soma: " + soma.somar());
        System.out.println("SomaStream: " + soma.somarStream());
        System.out.println("Maior: " + soma.encontrarMaior());
        System.out.println("Menor: " + soma.encontrarMenor());
        soma.exibirNumeros();
    }
}
