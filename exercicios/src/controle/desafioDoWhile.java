package controle;

import java.util.Scanner;

public class desafioDoWhile {
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		Double nota,total= 0.0;
		Integer count = 0;

		System.out.println("Informe as notas, digite -1 para sair.");

		do {
			System.out.print("Digite a nota: ");
			nota = entrada.nextDouble();

			if (nota <= 10 && nota >= 0) {
				total += nota;
				count++;
			}
			if (nota == -1) {
				count--;
			}

		} while (nota != -1);
		entrada.close();
		System.out.println("Total: " + total);
		System.out.println("Count: " + count);

		Double media = total / count;

		System.out.println("Media da sala: " + media);

	}
}
