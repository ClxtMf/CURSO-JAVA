package curso_java.Exercicios1;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int senha = sc.nextInt();

        while (senha != 2002) {
            System.out.println("Senha incorreta!");
            senha = sc.nextInt();
        }
        System.out.println("Acesso permitido!");
        sc.close();
    }
}
