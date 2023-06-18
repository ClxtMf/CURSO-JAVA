package curso_java.Exercicios1;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int x = 4;
        int y = 0;
        int i = 0;

        while (i < x) {
            i = i + 1;
            y = y + i;
            System.out.println(i);
            System.out.println(y);
        }

        // tela: (11, 23, 36, 410)
        sc.close();
    }
}