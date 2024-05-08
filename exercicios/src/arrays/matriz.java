package arrays;

import java.util.Scanner;

public class matriz {
	public static void main(String[] args) {
		Scanner entry = new Scanner(System.in);

		System.out.println("How many students: ");
		int qtdStudents = entry.nextInt();

		System.out.println("How many notes: ");
		int qtdNotes = entry.nextInt();

		double classNotes[][] = new double[qtdStudents][qtdNotes];

		double total = 0;

		for (int i = 0; i < classNotes.length; i++) {
			for (int j = 0; j < classNotes[i].length; j++) {
				System.out.printf("Insert student's %d note %d: ", i+1, j+1);
				classNotes[i][j] = entry.nextDouble();
				total += classNotes[i][j];
			}
		}

		double average = total / (qtdStudents * qtdNotes);
		System.out.println("Class average: " + average);

		entry.close();

	}
}
