package classVsInstancia;

public class AreaCircTeste {
	public static void main(String[] args) {
		AreaCirc a1 = new AreaCirc(10);
//		a1.pi=10;
		System.out.println(a1.area());
		
//		AreaCirc.PI = 3.14; // When I put 'final static' in a class, this PI is locked.
		AreaCirc a2 = new AreaCirc(5);
//		a2.pi=0;
		System.out.println(a2.area());
		
	}
}
