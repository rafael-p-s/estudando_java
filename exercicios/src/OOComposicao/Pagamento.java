package OOComposicao;

public class Pagamento {
	public static void main(String[] args) {
		Compra compra1 = new Compra();
		compra1.cliente = "Rafael P.";
		compra1.itens.add(new Items("Caneta", 20, 7.45));
		compra1.itens.add(new Items("Borracha", 12, 3.99));
		
		System.out.println(compra1.itens.size());
		System.out.println(compra1.getValorTotal());
	}
}
