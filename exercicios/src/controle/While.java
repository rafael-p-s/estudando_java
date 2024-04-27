package controle;

import java.util.Scanner;

public class While {
	public static void main(String[] args) {
//		int count = 1;
//
//		while (count <= 10) {
//			System.out.println("Olá");
//			count++;
//		}
		Scanner entrada = new Scanner(System.in);
		String valor = "";
		while (!valor.equalsIgnoreCase("sair")) {
			System.out.print("Você diz: ");
			valor = entrada.nextLine();
		}
		entrada.close();
	}
}
