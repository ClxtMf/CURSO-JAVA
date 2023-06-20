package curso_java.Exercicios1;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n;
        double soma, media;

        System.out.println("Quantos elementos vai ter o vetor? ");
        n = sc.nextInt();

        double[] vetor = new double[n];

        for (int i=0; i<n; i++) {
            System.out.println("Digite um número: ");
            vetor[i] = sc.nextDouble();
        }

        soma = 0;
        for (int i=0; i<n; i++) {
            soma += vetor[i];
        }

        media = soma / n;

        System.out.printf("\nMEDIA DO VETOR = %.3f\n", media);
        System.out.printf("ELEMENTOS ABAIXO DA MEDIA: ");

        for (int i=0; i<n; i++) {
            if (vetor[i] < media) {
                System.out.printf("%.1f\n", vetor[i]);
            }
        }

        sc.close();

    }
}
