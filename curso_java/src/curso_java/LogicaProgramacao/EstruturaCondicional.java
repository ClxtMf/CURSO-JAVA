package curso_java.LogicaProgramacao;

import java.util.Locale;
import java.util.Scanner;

public class EstruturaCondicional {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        // Simples
        int x = 5;

        System.out.println("Bom dia!");

        if (x > 6) {
            System.out.println("Boa tarde!");
        }

        System.out.println("Boa noite!");

        // Composta
        int hora;

        System.out.println("Quantas horas:");
        hora = sc.nextInt();

        if (hora < 12) {
            System.out.println("Bom dia!");
        }
        else {
            System.out.println("Boa tarde!");
        }

        // Encadeamento de estruturas condicionais
        int hora1;

        System.out.println("Quantas horas: ");
        hora1 = sc.nextInt();

        if (hora1 < 12) {
            System.out.println("Bom dia!");
        }
        else {
            if (hora1 > 12 && hora1 < 18) {
                System.out.println("Boa tarde!");
            }
            else {
                System.out.println("Boa noite!");
            }
        }

        sc.close();
    }
}
