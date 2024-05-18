package OOComposicao.Desafio;

import java.util.ArrayList;
import java.util.List;

public class Compra {

	final List<Item> itens = new ArrayList<>();
	
	void addItem(Produto p, int amount) {
		this.itens.add(new Item(p, amount));
	}
	//Método para facilitar a criação e adição para item e produto.
	void addItem(String name, double price, int amount) {
		var produto = new Produto(name, price);
		this.itens.add(new Item(produto, amount));
	}
	
	double getTotal() {
		double total = 0;
		
		for(Item item: itens) {
			total += item.amount* item.produto.price;
		}
		
		return total;
	}
}
