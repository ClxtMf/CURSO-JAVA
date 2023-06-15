package curso_java.Exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Ex8 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        if (N < 0) {
            System.out.println("Negativo!");
        } else {
            System.out.println("Positivo!");
        }

        sc.close();
    }
}
