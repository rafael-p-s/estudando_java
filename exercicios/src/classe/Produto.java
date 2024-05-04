package classe;

public class Produto {
//	In this case, doesn't create a "main" beacause it is a class
	// This belong to OBJECT
	String nome;
	double preco;
	double desconto;

	//This is a standard constructor
	Produto(String nomeInicial,double precoInicial)//this is an explicit form.
	{
		nome = nomeInicial; //We need to do this for it to work.
		preco = precoInicial;
	}
	
	//This is to use with Produto 2, p2:
	Produto(){}
	
	// In this case, I did not need to pass the parameter in '(...)'. Because the variable is next to the method.
	double precoComDesconto(){
		return preco * (1-desconto);
	}
}
