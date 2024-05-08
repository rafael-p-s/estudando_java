package classe;

public class Equals {
	public static void main(String[] args) {
		Usuario u1 = new Usuario();
		u1.name = "Rafael Silva";
		u1.email = "rafael.silva@gmail.com.br";
		
		Usuario u2 = new Usuario();
		u2.name = "Rafael Silva";
		u2.email = "rafael.silva@gmail.com.br";
		
//		System.out.println(u1 == u2); // this need to return "false"		
		System.out.println(u1.equals(u2)); //It will also return "false" because we didn't change anything
		System.out.println();
		
		
	}
}
