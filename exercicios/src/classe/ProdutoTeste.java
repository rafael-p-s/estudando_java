package classe;

public class ProdutoTeste {
	public static void main(String[] args) {

//About this case, I'm creating this variable using the 
//'Produto' class.
//I don't need to import 'Produto' because the files 
//are in the same package.

		// Type variable = new instantiate(instânciar)
		// P1 and P2 i can call this how "instância" or "membros"
		Produto p1 = new Produto("Notebook", 4356.59); //This is to be used with a constructor that has parameters
		p1.desconto = 0.25;

		// In JAVA, I can insert this variable because JAVA
		// can infer(inferir) the types.
		var p2 = new Produto(); // constructor
		p2.nome = "Caneta Preta"; // instantiate
		p2.preco = 2.56; // instantiate
		p2.desconto = 0.35; // instantiate

		System.out.println(p1.nome);
		System.out.println(p2.nome);

		// I'm can doing mathematics with this informations.
		// double precoFinal1 = p1.preco *(1-p1.desconto);
		// I no longer need this line /\. because I have the method: precoComDesconto.
		// Now I can do this \/
		double precoFinal1 = p1.precoComDesconto();
		System.out.printf("Resultado: R$%.2f.", precoFinal1);

		System.out.println();

		double precoFinal2 = p2.precoComDesconto();
		System.out.printf("Resultado: R$%.2f.", precoFinal2);
	}
}
