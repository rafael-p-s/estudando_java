package colecoes;

import java.util.ArrayList;

public class Lista {
	public static void main(String[] args) {

		ArrayList<Usuario> lista = new ArrayList<Usuario>();

		// I can to create with 2 models:
//		Usuario u1 = new Usuario("Ana");//Model 1

		// Model 2:
		lista.add(new Usuario("Rafael"));// index 0
		lista.add(new Usuario("Caio"));// index 1
		lista.add(new Usuario("Eithor"));// index 2
		lista.add(new Usuario("Tales"));// index 3

		// To get the element with "id"
		System.out.println(lista.get(3).name);// Will show Tales, because Tales is the index 3

		// Now is possible to remove through the index.
		System.out.println("Remove: " + lista.remove(1));
		// or using:
//		System.out.println(lista.remove(new Usuario("Tales")));

		// It will check if have the user exists.
		System.out.println("Tem? " + lista.contains(new Usuario("Rafael")));
		for (Usuario u : lista) {
			System.out.println(u);// In the back he using "u.toString()"
			// If I use "u.name" he will show only the name.
		}

	}
}
