
package curso_java.LogicaProgramacao;

import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		System.out.println("Olá, Mundo!");
		
		char sexo = 'F';
		double n = 1.90;
		int n1 = 12;
		
		double x = 10.82922;
		System.out.println(x);
		System.out.printf("%.2f%n", x);
		
		System.out.println("RESULTADO = " + x + " METROS");
		System.out.printf("RESULTADO = %.2f metros%n", x);
		
		String nome = "Maria";
		int idade = 31;
		double renda = 4000.00;
		
		System.out.printf("%s tem %d anos e ganha R$ %.2f reais%n", nome, idade, renda);

	}

}
