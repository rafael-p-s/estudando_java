package colecoes;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Mapa {
	public static void main(String[] args) {
		
		Map<Integer, String> user = new HashMap<>();
		user.put(1, "Rafael");
		System.out.println(user);
		
		//When use 'Map' we can't use 'add', we need use 'put'.
		//ALERT
		//If I insert a new element with the same element key as one
//		already create in the 'Map', the new element will replace
//		the old one.
		
		System.out.println();
		user.put(1, "Eithor");
		user.put(2, "Pedro");
		user.put(3, "Paulo");
		user.put(4, "Ana");
		user.put(5, "Rafael");
		System.out.println(user);
		
		//To return all users grouped by their IDs.
		System.out.println(user.keySet());//It's possible to return 
		// the users with the positions changes
		
		for(int key:user.keySet()) {
			System.out.println(key);
		}
		System.out.println();
		for(String value:user.values()) {
			System.out.println(value);
		}
		System.out.println();
		
		//In this case, We can take 'key' and 'user' and display them together.
		for(Entry<Integer,String> registration: user.entrySet()) {
			System.out.print(registration.getKey()+"==>");
			System.out.println(registration.getValue());
		}
	}
}
