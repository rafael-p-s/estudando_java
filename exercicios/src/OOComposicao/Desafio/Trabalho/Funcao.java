package OOComposicao.Desafio.Trabalho;

import java.util.ArrayList;
import java.util.List;

public class Funcao {

	String nameFuncao;

	Funcao(String nameFuncao) {
		this.nameFuncao = nameFuncao;
	}

	List<HoraTrabalhada> horas = new ArrayList<HoraTrabalhada>();

	void addHoraTrabalho(ValorHora vh, int time) {
		this.horas.add(new HoraTrabalhada(vh, time));
	}
	
	void addHoraTrabalho(double price, int time) {
		var receber = new ValorHora(price);
		this.horas.add(new HoraTrabalhada(receber, time));
	}

	double getTimePrice() {
		double total = 0;
		for (HoraTrabalhada horatrabalhada : horas) {
			total += horatrabalhada.time * horatrabalhada.valorHora.price;
		}
		return total;
	}

	public String toString() {
		return nameFuncao;
	}
	
}
