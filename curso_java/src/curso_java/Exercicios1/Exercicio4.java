package curso_java.Exercicios1;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int x = 0;
        while (x < 5) {
            int y = x * 3;
            System.out.print(y);
            x = x + 1;
        }
        System.out.println("Fim");

        // tela: 0-0, 1-3, 2-6, 3-9, 4-12 (0, 3, 6, 9, 12, fim)
    }
}