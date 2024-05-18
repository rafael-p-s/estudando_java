package OOComposicao.Desafio;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
	final String name;

	final List<Compra> compras = new ArrayList<Compra>();

	Cliente(String name) {
		this.name = name;
	}

	void getCompra(Compra compra) {
		this.compras.add(compra);
	}

	String getTotal() {
		double total = 0;

		for (Compra compra : compras) {
			total += compra.getTotal();
		}
		return "Total geral da compra: " + total;
	}

}
