package desafioJantar;

public class Pessoa {
	String nome;
	Double peso;
	Double newPeso;

	public Comida pesoComida;

	Pessoa(String nome, double peso) {
		this.nome = nome;
		this.peso = peso;
	}

	Double Comer(Comida PesoComida) {
		return newPeso = peso + PesoComida.PesoComida();
	}

	// Teacher mode:
//	void comer(Comida comida) {
//		if(comida != null) {
//			this.peso += comida.peso;
//		}
//	}

}
