package desafioJantar;

public class Comida {

	String nome;
	Double peso;

	Comida(String nome, double peso) {
		this.nome = nome;
		this.peso = peso;
	}

	public double PesoComida() {
		return peso;
	}
}
