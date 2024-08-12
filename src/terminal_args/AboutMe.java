package terminal_args;

import java.util.InputMismatchException;
import java.util.Scanner;

public class AboutMe {

    public static void main(String[] args) {
        String nome = "";
        String sobrenome = "";
        int idade = 0;
        double altura = 0.0;
        if (args.length == 0) {
            System.out.println("Digite o nome, sobrenome, idade e altura");
        }else {
            nome = args[0];
            sobrenome = args[1];
            idade = Integer.valueOf(args[2]);
            altura = Double.valueOf(args[3]);
            System.out.println("Olá meu nome é " + nome + " " + sobrenome);
            System.out.println("tenho " + idade + " anos e " + altura + " mts de altura");
        }
        try {
            Scanner scan = new Scanner(System.in);
            System.out.println("Digite o seu nome:");
            nome = scan.nextLine();
            System.out.println("Digite o seu sobrenome:");
            sobrenome = scan.nextLine();

            System.out.println("Digite o seu idade:");
            idade = Integer.valueOf(scan.nextLine());
            System.out.println("Digite o seu altura:");
            altura = Double.valueOf(scan.nextLine());

            System.out.println("Olá meu nome é " + nome + " " + sobrenome);
            System.out.println("tenho " + idade + " anos e " + altura + " mts de altura");
            scan.close();
        } catch (Exception e) {
            System.out.println("Ocorreu um erro na entrada de dados");

        }

    }
}
