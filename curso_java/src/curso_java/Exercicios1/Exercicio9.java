package curso_java.Exercicios1;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio9 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int alcool = 0;
        int gasolina = 0;
        int diesel = 0;

        System.out.println("Opções disponíveis: 1-Alcool, 2-Gasolina, 3-Diesel");

        int tipo = sc.nextInt();
        while (tipo > 0 && tipo < 4) {
            if (tipo == 1) {
                alcool += 1;
            } else if (tipo == 2) {
                gasolina += 2;
            } else if (tipo == 3) {
                diesel += 3;
            }

            System.out.println("MUITO OBRIGADO!");
            System.out.println("Alcool: " + alcool);
            System.out.println("Gasolina: " + gasolina);
            System.out.println("Diesel: " + diesel);

            break;
        }

        System.out.println("Nenhuma opção escolhida!");

        sc.close();
    }
}
