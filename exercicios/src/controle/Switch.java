package controle;

public class Switch {
	public static void main(String[] args) {
		String faixa = "amarela";

		switch (faixa.toLowerCase()) {
		case "preta":
			System.out.println("Sabe fazer todos os katares");
			break;
		case "marrom":
			System.out.println("Katares até a marrom");
			break;
		case "roxa":
			System.out.println("Katares até roxa");
			break;
		case "bordo":
			System.out.println("Katares até bordo");
			break;
		case "laranja":
			System.out.println("Katares até larajna");
			break;
		case "amarela":
			System.out.println("Katares até amarela");
			break;
		case "branca":
			System.out.println("Não sei nada,sou branca");
			break;
		}
	}
}
