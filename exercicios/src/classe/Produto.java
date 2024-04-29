package classe;

public class Produto {
//	In this case, doesn't create a "main" beacause it is a class
	// This belong to OBJECT
	String nome;
	double preco;
	double desconto;

	// In this case, I did not need to pass the parameter in '(...)'. Because the variable is next to the method.
	double precoComDesconto(){
		return preco * (1-desconto);
	}
}
