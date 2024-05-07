package desafioArrays;

import java.util.Scanner;

public class NotasArraysForEach {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.println("N° quantidade de notas: ");
		
		int notas = entrada.nextInt();
		
		double arrayNotas[] = new double[notas];
		
		double total = 0;
		
		for (int i = 0; i < notas; i++) {
			System.out.printf("Informe a %d° nota: ", i+1);
			arrayNotas[i] = entrada.nextDouble();
		}
		for(double array:arrayNotas) {
			total += array;
		}
		
		System.out.printf("Média %.2f",total/arrayNotas.length);


		entrada.close();

	}
}