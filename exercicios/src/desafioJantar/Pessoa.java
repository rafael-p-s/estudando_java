package desafioJantar;

public class Pessoa {
	String nome;
	Double peso;
	Double newPeso;

	public Comida pesoComida;

	Pessoa(String nomePessoa, double pesoPessoa) {
		nome = nomePessoa;
		peso = pesoPessoa;
	}

	Double pessoaComida(Comida PesoComida) {
		return newPeso = peso + PesoComida.PesoComida();
	}

//	double ComerComida() {
//		return newPeso =  pesoComida;
//	}

}
