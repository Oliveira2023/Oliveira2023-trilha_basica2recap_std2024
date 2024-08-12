package debugging;

import java.util.Locale;
import java.util.Scanner;

public class CalculadoraDeMedias {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in).useLocale(Locale.US);
        String[] alunos = {"Camila", "Lucas", "Bruna", "Pedro"};
        double media = calcularMediaDaTurma(alunos, entrada);
        System.out.printf("Media da turma %.2f",media);
    }
    public static double calcularMediaDaTurma(String[] alunos, Scanner entrada) {
        double soma = 0;
        for (String aluno : alunos) {
            System.out.printf("Digite a nota do aluno %s: ", aluno);
            double nota = entrada.nextDouble();
            soma += nota;
        }
        return soma / alunos.length;
    }
}
