package fundamentos;

import java.util.Scanner;

public class ConsoleUser {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.print("Digite sua idade: ");
		int idade = entrada.nextInt();
		System.out.println("Idade: "+idade);
		entrada.close();
		}
}
