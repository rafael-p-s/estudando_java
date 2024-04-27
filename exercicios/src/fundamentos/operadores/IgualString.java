package fundamentos.operadores;

import java.util.Scanner;

public class IgualString {
	public static void main(String[] args) {
		String nome = new String("Rafael");
		System.out.println("Rafael".equals(nome));

		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite um nome: ");
		String resp = entrada.nextLine();
		String texto = "Nome está ";
		System.out.println(texto + "Rafael".equals(resp.trim()));

	}
}
