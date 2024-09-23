package collections_api2023.list.soma_numeros;

import java.util.ArrayList;
import java.util.List;

public class SomaNumeros {
    private List<Integer> numeros;

    public SomaNumeros() {
        this.numeros = new ArrayList<>();
    }

    public void adicionarNumero(int numero) {
        numeros.add(numero);
    }
    public int somar() {
        int soma = 0;
        for (int numero : numeros) {
            soma += numero;
        }
        return soma;
    }
    public int somarStream() {
        return numeros.stream().reduce(0, Integer::sum);
    }
    public int encontrarMaior() {
        int maior = Integer.MIN_VALUE;
        for (int numero : numeros) {
            if (numero > maior) {
                maior = numero;
            }
        }
        return maior;
    }
    public int encontrarMenor() {
        int menor = Integer.MAX_VALUE;
        for (int numero : numeros) {
            if (numero < menor) {
                menor = numero;
            }
        }
        return menor;
    }
    public List<Integer> exibirNumeros() {
        System.out.println(numeros);
        return numeros;
    }

    @Override
    public String toString() {
        return "numeros=" + numeros;
    }
}
