package OOComposicao.Desafio;

public class ClienteTeste {
	public static void main(String[] args) {

		Compra compra1 = new Compra();
		compra1.addItem("Caneta", 1.25, 3);
		compra1.addItem(new Produto("Notebook",3500), 2);
		
		Compra compra2 = new Compra();
		compra2.addItem("Caderno", 22.99, 1);
		compra2.addItem(new Produto("TV",2500), 1);

		Cliente cliente1 = new Cliente("Rafael");
//		cliente1.compras.add(compra1);
//		cliente1.compras.add(compra2);
		cliente1.getCompra(compra1);
		cliente1.getCompra(compra2);
		
		System.out.println(cliente1.getTotal());
		
	}
}
