package curso_java.Exercicios1;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int x = 2;
        int y = 10;
        System.out.println("Olá");
        while (x < y) {
            System.out.println(x + "-" + y);
            x = x * 2;
            y = y + 1;
        }

        // tela: 2-10, 4-11, 8-12, 16-13 (olá, 2-10, 4-11, 8-12).
    }
}
