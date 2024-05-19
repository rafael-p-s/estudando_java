package OOComposicao.Desafio.Trabalho;

import java.util.ArrayList;
import java.util.List;

public class Funcionario {

	String nameFuncionario;

	List<Funcao> funcoes = new ArrayList<Funcao>();

	Funcionario(String nameFuncionario) {
		this.nameFuncionario = nameFuncionario;
	}

	void getFuncao(Funcao funcao) {
		this.funcoes.add(funcao);
	}

	String getPagamento() {
		double total = 0;
		for (Funcao funcao : funcoes) {
			total += funcao.getTimePrice();
		}
		return "Pagamento: "+total;
	}
	
	public String toString() {
		return nameFuncionario;
	}
	
}
