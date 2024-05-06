package desafioJantar;

public class Jantar {

	public static void main(String[] args) {
		Pessoa p1 = new Pessoa("Eithor", 55);
		Comida c1 = new Comida("Coxinha", 2.38);

		System.out.printf("Nome pessoa: %s, peso: %.2f Kg",p1.nome,p1.peso);
		System.out.println();
		System.out.printf("Nome comida: %s, peso: %.2f kg",c1.nome,c1.peso);
		System.out.println();
		System.out.printf("Novo peso da pesso: %.2f kg",p1.pessoaComida(c1));
//		System.out.printf("pessoaComida: "+p1.());
	}

}
