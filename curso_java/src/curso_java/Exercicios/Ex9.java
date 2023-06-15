package curso_java.Exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Ex9 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        if (N % 2 == 0) {
            System.out.println("Par!");
        } else {
            System.out.println("Impar!");
        }

        sc.close();
    }
}
