package colecoes;

import java.util.ArrayDeque;
import java.util.Deque;

public class Pilha {
	public static void main(String[] args) {

		Deque<String> book = new ArrayDeque<String>();

		book.add("Book1");
		book.push("Book2");// About the "push", return boolean and not add nothing.
		book.push("Book3");// In the event that I need to add a new item and the stack is full,
		// a warning will be displayed.

		//When I ask to peek an element, it will show Book3.
		System.out.println(book.peek());
		System.out.println(book.size());
		//I use 'poll' to remove items from the stack. In the case of a stack, the last item will be removed.
		//But if 'poll' doesn't find the element to remove, 'poll' will return null.
		//'pop' can use to remove too.
		
		//Both 'queue' and 'stack' use the same "métodos".
	}
}
