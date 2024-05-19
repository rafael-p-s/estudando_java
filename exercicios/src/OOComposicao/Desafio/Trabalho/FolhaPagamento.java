package OOComposicao.Desafio.Trabalho;

public class FolhaPagamento {
	public static void main(String[] args) {
		Funcao funcao1 = new Funcao("tester");
		funcao1.addHoraTrabalho(new ValorHora(15.5), 40);
		Funcionario funcionario1 = new Funcionario("Rafael");

		funcionario1.getFuncao(funcao1);

		System.out.println(funcionario1.getPagamento());

		System.out.println(funcao1);
		System.out.println(funcionario1);
	}
}
