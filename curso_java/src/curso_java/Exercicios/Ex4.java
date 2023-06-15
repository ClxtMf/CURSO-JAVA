package curso_java.Exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int w, x, y, z, diferenca;

        w = sc.nextInt();
        x = sc.nextInt();
        y = sc.nextInt();
        z = sc.nextInt();

        diferenca = (w * x - y * z);

        System.out.println(diferenca);

        sc.close();

    }
}
