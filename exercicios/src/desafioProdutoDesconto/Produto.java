package desafioProdutoDesconto;

public class Produto {
	static double desconto = 0.25;
	double valor;
	double resp;
	
	Produto(double valorProduto){
		valor = valorProduto;
	}
	
	double RespDesconto() {
		resp = valor * desconto;
		return resp;
	}
}
