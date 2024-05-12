package colecoes;

import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class ConjuntoComportado {
	public static void main(String[] args) {

		//SET doesn't respect order about 1°, 2°, 3°... 
//		Set<String> listaAprovados = new HashSet<>();//Will receive only String types.
		
		//We can use this line to keep the order:
		SortedSet<String> listaAprovados = new TreeSet<String>();//TreeSet will put in order alphabetic.
		
		listaAprovados.add("Rafael");//If i try to put a double or integer will create a error code.
		listaAprovados.add("Ana");
		listaAprovados.add("Pedro");
		listaAprovados.add("Eithor");
		
		for(String candidato: listaAprovados) {
			System.out.println(candidato);
		}
		
		System.out.println();
		
		Set<Integer> nums = new HashSet<>();
		nums.add(1);
		nums.add(2);
		nums.add(120);
		nums.add(31);
		
		for(int n:nums) {
			System.out.println(n);
		}
	}
}
