package curso_java.Exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Ex11 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int horaInicial = sc.nextInt();
        int horaFinal = sc.nextInt();

        int duracao;
        if (horaInicial < horaFinal) {
            duracao = horaFinal - horaInicial;
        } else {
            duracao = 24 - horaInicial - horaFinal;
        }
        System.out.println("O jogo durou " + duracao + "Hora(s)!!!");

        sc.close();

    }
}
