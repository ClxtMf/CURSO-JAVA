package curso_java.Exercicios1;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int x = 2;
        int y = 0;

        while (x < 60) {
            System.out.println(x);
            x = x * 2;
            y = y + 10;
        }

        // tela: 2-0, 4-10, 8-20, 16-30, 32-40, 64-50 (2, 4, 8, 16, 32)
    }
}