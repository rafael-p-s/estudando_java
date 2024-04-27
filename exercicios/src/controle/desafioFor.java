package controle;

public class desafioFor {
	public static void main(String[] args) {

		String valor = "#";

		for (String i = "#"; !i.equals("######"); i += "#") {
		    System.out.println(valor);
		    valor += "#";
		}
	}
}
