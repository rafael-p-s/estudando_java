package fundamentos.operadores;

public class DesafioLogicos {
	public static void main(String[] args) {
		System.out.println("Trabalho1 é Terça.");
		System.out.println("Trabalho2 é Quinta");
		System.out.println("Caso ambos os 2 trabalhos deem certo, comprar TV 50° no final de semana e tomar sorvete");
		System.out.println("Se 1, dos 2 trabalhos, derem certo comprar TV 30° no final de semana e tomar sorvete");
		System.out.println("Se nenhum trabalho der certo, ficar em casa sem TV e sem sorvete.");
		boolean trabalho1 = true;
		boolean trabalho2 = true;
		System.out.println();

		System.out.println("Vai ter TV50°? ");
		System.out.println(trabalho1 || trabalho2);
		System.out.println("Vai ter sorvete?");
		System.out.println(trabalho1 && trabalho2);

		System.out.println();

		System.out.println("Vai ter tv30°+sorvete?");
		System.out.println(trabalho1 || !trabalho2);
		System.out.println();

		System.out.println("Vai ter trabalho de TERÇA?");
		System.out.println(!trabalho1);
		System.out.println("Então trabalho de QUINTA vai ter?");
		System.out.println(trabalho2);
		
		System.out.println();
		System.out.println("Nenhum dos 2 trabalhos deu certo...");
		System.out.println(trabalho1 && trabalho2);
		System.out.println("Sem sorvete...");
	}
}
