package curso_java.LogicaProgramacao;

import java.util.Locale;
import java.util.Scanner;

class public EstruturaRepetitiva {
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();

        while (x != 0) {
            x = sc.nextInt();
        }
    }
}