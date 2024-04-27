package fundamentos.operadores;

public class Ternario {
	public static void main(String[] args) {
		double media = 7.6;
		String resultado = media >= 7.0 ? "Aprovado" : "Reprovado";
		System.out.println("O aluno está: "+resultado);
		
		int a = 1;
		String result = a >=9 ? "Maior" : "Menor";
		System.out.println(result);
	}
}
