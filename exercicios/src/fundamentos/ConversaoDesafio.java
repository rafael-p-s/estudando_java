package fundamentos;

import java.util.Scanner;

public class ConversaoDesafio {
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.print("Digite o 1°salario:");
		String sal1 = entrada.next().replace(",", ".");
		System.out.println("Digite o 2° salario:");
		String sal2 = entrada.next().replace(",", ".");
		System.out.println("Digite o 3° salario:");
		String sal3 = entrada.next().replace(",", ".");

		// Conversion:
		double dSal1 = Double.parseDouble(sal1);
		double dSal2 = Double.parseDouble(sal2);
		double dSal3 = Double.parseDouble(sal3);
		double soma = dSal1 + dSal2 + dSal3;

		// Print:
		System.out.println("Soma: " + soma);
		System.out.printf("Media: R$%.2f",soma/3);

		entrada.close();
	}
}
