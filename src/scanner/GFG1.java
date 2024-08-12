package scanner;

// Java program to illustrate the
// hasNextLine() method of Scanner class in Java
// without parameter

import java.util.*;

public class GFG1 {
    public static void main(String[] argv)
            throws Exception
    {

        String s = "gfg 2 geeks!";

        // new scanner with the
        // specified String Object
        Scanner scanner = new Scanner(System.in);

        // use US locale to interpret Lines in a string
        scanner.useLocale(Locale.US);
        boolean sair = false;
        // iterate till end
        while (!sair) {
            System.out.println("digite alguma coisa:");
            String input = scanner.nextLine();
           System.out.println(input);
            if (input.equalsIgnoreCase("sair")) {
                sair = true;
                break;
            }
        }
        System.out.println("fora do while ou pulou o while");
        // close the scanner
        scanner.close();
    }
}