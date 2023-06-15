package curso_java.Exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Ex5 {
    public static void main(String[] aStrings) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int numero, horas;
        double valorHora, salario;

        numero = sc.nextInt();
        horas = sc.nextInt();
        valorHora = sc.nextDouble();

        salario = valorHora * horas;

        System.out.println("Number =" + numero);
        System.out.println("Salary = U$ %.2f%n" + salario);

        sc.close();
    }
}
