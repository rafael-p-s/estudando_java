package desafioJantar;

public class Comida {

	String nome;
	Double peso;

	Comida(String nomeComida, double pesoComida) {
		this.nome = nomeComida;
		this.peso = pesoComida;
	}

	public double PesoComida() {
		return peso;
	}
}
