package curso_java.LogicaProgramacao;

import java.util.Locale;
import java.util.Scanner;

class public EstruturaRepetitiva {
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        // estrutura de repetição "enquanto"
        int x = sc.nextInt();

        int soma = 0;
        while (x != 0) {
            soma = soma + x;
            x = sc.nextInt();
        }

        System.out.println(soma);

        // teste de mesa manual 
        int x = 0;
        int y = 4;

        while (x < 3) {
            y = y + 2;
            x = x + 1;
            System.out.println(x + "-" + y);
        }

        // tela: 1-6, 2-8, 3-10.

        sc.close();
    }
}