package curso_java.Exercicios1;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
    
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int x = 100;
        int y = 100;

        while (x != y) {
            System.out.println("Olha");
            double r = Math.sqrt(y);
            System.out.println(r);
        }

        // tela: []
    }
}
