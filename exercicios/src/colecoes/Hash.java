package colecoes;

import java.util.HashSet;

public class Hash {
	public static void main(String[] args) {
		HashSet<Usuario> users = new HashSet<Usuario>();
		
		users.add(new Usuario("Rafael"));
		users.add(new Usuario("Gabriel"));
		users.add(new Usuario("Beitum"));
		
		
		boolean resp = users.contains(new Usuario("Beitum"));
		System.out.println(resp);
		//If I will in the file: 'Usuario' and commet this part about code:
//		@Override
//		public int hashCode() {
//			//This area will generate unique numbers to assign names, similar to an 'id'.
//
//			final int prime = 31;
//			int result = 1;
//			result = prime * result + ((name == null) ? 0 : name.hashCode());
//			return result;
//		}
		
		//The answer will be 'false'
	}
}
