package fundamentos;

import javax.swing.JOptionPane;

public class ConverterStringToNumber {
	public static void main(String[] args) {
		String valor1 = JOptionPane.showInputDialog("Digite o primeiro n°:");
		String valor2 = JOptionPane.showInputDialog("Digite o segundo número:");

		System.out.println(valor1 + valor2);

		//To make conversion:
		double numero1 = Double.parseDouble(valor1);
		double numero2 = Double.parseDouble(valor2);
		
		double soma = numero1+numero2;
		System.out.println("Soma: "+soma);
		System.out.println("Média: "+soma/2);
	}
}
