package classe;

public class ProdutoTeste {
	public static void main(String[] args) {

//About this case, I'm creating this variable using the 
//'Produto' class.
//I don't need to import 'Produto' because the files 
//are in the same package.
		
		
		//Type variable = new instantiate(instânciar)
		Produto p1 = new Produto();
		p1.nome = "Notebook";
		p1.preco = 4356.59;
		p1.desconto=0.25;
		
		//In JAVA, I can insert this variable beacuse JAVA
		// can infer(inferir) the types.
		var p2 = new Produto();
		p2.nome = "Caneta Preta";
		p2.preco = 2.56;
		p2.desconto=0.35;
		
		System.out.println(p1.nome);
		System.out.println(p2.nome);
		
		//I'm can doing mathematics with this informations.
		double precoFinal1 = p1.preco *(1-p1.desconto);
		System.out.printf("Resultado: R$%.2f.",precoFinal1);
	}
}
