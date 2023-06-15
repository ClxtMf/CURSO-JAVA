package curso_java.Exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int x, y, soma;

        x = sc.nextInt();
        y = sc.nextInt();
        
        soma = x + y;

        System.out.println("Exercicios resolvido:");
        System.out.printf("Primeiro número: %d%n", x);
        System.out.printf("Segundo número: %d%n", x);
        System.out.printf("Soma dos dois números: %d", soma);



        // Outra forma/simples 
        int A, B, soma1;

		A = sc.nextInt();
		B = sc.nextInt();

		soma1 = A + B;

		System.out.println("SOMA = " + soma1);

		sc.close();

    }
}
