package fundamentos.operadores;

import java.util.Scanner;

public class DesafioCalculadora {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.println("Digite o 1°n°:");
		double n1 = entrada.nextDouble();

		System.out.println("Digite o 2°n°:");
		double n2 = entrada.nextDouble();

		System.out.println("Informe o tipo da operação");
		String op = entrada.next();

		// Lógica:
		double resultado = "+".equals(op) ? n1 + n2 : 0;
		resultado = "-".equals(op) ? n1 - n2 : resultado;
		resultado = "*".equals(op) ? n1 * n2 : resultado;
		resultado = "/".equals(op) ? n1 / n2 : resultado;
		resultado = "%".equals(op) ? n1 % n2 : resultado;

		System.out.printf("Resultado: %.2f %s %.2f = %.2f", n1, op, n2, resultado);
		entrada.close();
	}
}
