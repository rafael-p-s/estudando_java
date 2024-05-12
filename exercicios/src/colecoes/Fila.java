package colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {
	public static void main(String[] args) {

		Queue<String> line = new LinkedList<String>();
		
		line.add("Rafael");//Return an exception if line is full.
		line.offer("Eithor");//Return false if line is full.

		//Take element from line ... peek()
		System.out.println(line.peek());//If line is empty will return null
//		System.out.println(line.element());//If line is empty return an error
		
//		line.isEmpty();//Check if line is empty or not.
//		line.size();//Check size
//		line.clear();//Clean the line.
		
		System.out.println("Remove with 'pool':");
		System.out.println(line.poll());//It will take the first element, display it, and then remove it from the line.
		
	}
}
