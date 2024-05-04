package valorVSreferencia;

public class ValorVsReferencia {
public static void main(String[] args) {
	double a = 2;
	double b = a; // I'm granting 'a' for 'b' as if it were a value.
	
	a++;
	b--;
	System.out.println(a+" "+b);
}
}
