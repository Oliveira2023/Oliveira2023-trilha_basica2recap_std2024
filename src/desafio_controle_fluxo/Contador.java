package desafio_controle_fluxo;

import java.util.Scanner;

public class Contador{
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite um numero: ");
        int parametroUm = entrada.nextInt();
        System.out.println("Digite outro numero: ");
        int parametroDois = entrada.nextInt();

        try {
            contar(parametroUm, parametroDois);
        }catch (ParametrosInvalidosException e) {
            System.out.println(e.getMessage());
        }
    }
    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
        if (parametroUm > parametroDois) {
            throw new ParametrosInvalidosException();
        }else {
            int contagem = parametroDois - parametroUm;
            for (int i = 1; i <= contagem; i++) {
                System.out.println(i);
            }
        }
    }
}
