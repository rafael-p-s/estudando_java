package controle;

import javax.swing.JOptionPane;

public class desafioDiaSemana {
	public static void main(String[] args) {
		// Domingo -> 1
		// Quarta -> 4
		// terça - >3

		String entrada = JOptionPane.showInputDialog("Informe um dia da semana: ");
		String resp = entrada.toLowerCase();

		if ("domingo".equals(resp)) {
			System.out.println("Domingo = 1");
		}
		if ("segunda".equals(resp)) {
			System.out.println("Segunda = 2");
		}
		if("terça".equals(resp)) {
			System.out.println("Terça = 3");
		}
		if("quarta".equals(resp)) {
			System.out.println("Quarta = 4");
		}
		if("quinta".equals(resp)) {
			System.out.println("Quinta = 5");
		}
		if("sexta".equals(resp)) {
			System.out.println("Sexta = 6");
		}
		if("sábado".equals(resp) || "sabado".equals(resp)) {
			System.out.println("Sábado = 7");
		}
		else {
			System.out.println("Dia invalido: "+resp);
		}
	}
}
