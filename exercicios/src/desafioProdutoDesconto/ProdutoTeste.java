package desafioProdutoDesconto;

public class ProdutoTeste {
	public static void main(String[] args) {
		Produto venda = new Produto(14.99);
		Produto.desconto = 0.35;
		System.out.printf("Desconto: R$%.2f",venda.RespDesconto());
	}
}
