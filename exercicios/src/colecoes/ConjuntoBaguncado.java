package colecoes;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoBaguncado {
	public static void main(String[] args) {
		HashSet conjunto = new HashSet();
		conjunto.add(1.2);// double -> convert to Double(class)
		conjunto.add(true);// boolean -> convert to Boolean(class)
		conjunto.add("Teste");// String
		conjunto.add(1);// int -> convert to Integer(class)
		conjunto.add('x');// char -> convert to Character(class)

		// I'm showing the size about "conjunto"
		System.out.println("Size is: " + conjunto.size());

		conjunto.add("teste"); // in this case, they aren't equal because I have "Teste" with T and "teste"
								// with t
		// SET aren't accept 2 elements equals
		System.out.println("Size is: " + conjunto.size());// this show "6", because the text above

		System.out.println(conjunto.remove("teste"));
		System.out.println(conjunto.remove("Teste"));
		System.out.println("Size is: " + conjunto.size());
		
		//'Contains' is used to check whether an element is present or not
		System.out.println(conjunto.contains('x'));

		
		Set nums = new HashSet(); //This is comment after in O.O
		nums.add(1);
		nums.add(2);
		nums.add(3);
		
		//I'll show the "arrays"
		System.out.println(nums);
		System.out.println(conjunto);
		
		//I'm mixing(juntar) those "arrays"
		//It isn't put in order.
		conjunto.addAll(nums);//It's about mixing about two groups
		System.out.println();
		System.out.println(conjunto);
		
//		conjunto.retainAll(nums);//Use this to hold the values collected in '()'.
		
		conjunto.clear();
		System.out.println(conjunto);
		
		
	}

}
