package curso_java.LogicaProgramacao;

import java.util.Locale;

public class CondicionalTernaria {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        // Condicional simples
        double preco = 34.5;
        double desconto;
        if (preco < 20.0) {
            desconto = preco * 0.1;
        } else {
            desconto = preco * 0.05;
        }

        System.out.println(desconto);

        // Condicional ternária
        double preco1 = 34.5;
        double desconto1 = (preco1 < 20.0) ? preco1 * 0.1 : preco1 * 0.05;

        System.out.println(desconto1);
    }
}
