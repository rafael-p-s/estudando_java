package OOComposicao;

import java.util.ArrayList;

public class Compra {
	String cliente;// Com 1 caso real, aqui seria outra Classe.
	ArrayList<Items> itens = new ArrayList<Items>(); // 1(Compra)-Muitos(items)

	double getValorTotal() {
		double total = 0;
		
		for(Items items: itens) {
			total += items.amount * items.price;
		}
		
		
		return total;
	}
}
