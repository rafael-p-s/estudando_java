package arrays;

import java.util.Scanner;

public class matriz {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.println("How many students: ");
		int qtdStudents = entrada.nextInt();

		System.out.println("How many notes: ");
		int qtdNotes = entrada.nextInt();

		double classNotes[][] = new double[qtdStudents][qtdNotes];

		double total = 0;

		for (int i = 0; i < classNotes.length; i++) {
			for (int j = 0; j < classNotes[i].length; j++) {
				System.out.printf("Insert student's %d note %d", i+1, j+1);
				classNotes[i][j] = entrada.nextDouble();
				total += classNotes[i][j];
			}
		}

		double averege = total / (qtdStudents * qtdNotes);
		System.out.println("Class averege: " + averege);

		entrada.close();

	}
}
