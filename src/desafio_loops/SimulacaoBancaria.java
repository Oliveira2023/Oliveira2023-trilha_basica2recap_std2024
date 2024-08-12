package desafio_loops;

import java.util.Scanner;

public class SimulacaoBancaria {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double saldo = 0;
        Boolean sair = false;
        // Loop infinito para manter o programa em execução até que o usuário decida sair
        while (!sair) {

            System.out.println("Digite a opção desejada:");
            System.out.println("Opçao 1 - Deposito");
            System.out.println("Opçao 2 - Saque");
            System.out.println("Opção 3 - Deposito");
            System.out.println("Opção 0 - Sair");
            int opcao = scanner.nextInt();
            // TODO: Implemente as condições necessárias para avaliaa a opção escolhida:
            // Dica: Utilze o switch/case para o programa realizar as operações escolhidas pelo usuário.
            switch (opcao) {
                case 1:
                    System.out.println("Opção 1 - Digite o valor do deposito:");
                    double deposito = scanner.nextDouble();
                    saldo += deposito;
                    System.out.println("Saldo atual: " + saldo);
                    break;

                case 2:
                    System.out.println("Opção 2 - Digite o valor do saque:");
                    double saque = scanner.nextDouble();
                    if (saque > saldo) {
                        System.out.println("Saldo insuficiente.");
                    }else {
                        saldo -= saque;
                        // System.out.println("Saque realizado com sucesso");
                        System.out.println("Saldo atual: " + saldo);
                    }
                    break;

                case 3:
                    System.out.println("Saldo atual: " + saldo);
                    break;

                case 0 :
                    System.out.println("Programa encerrado.");
                    sair = true;
                    break;
                // Exibe mensagem de opção inválida se o usuário escolher uma opção inválida:
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }

        }
    }
}
