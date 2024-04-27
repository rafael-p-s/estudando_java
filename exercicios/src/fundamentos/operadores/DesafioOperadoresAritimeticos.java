package fundamentos.operadores;

public class DesafioOperadoresAritimeticos {
	public static void main(String[] args) {
		// a >> [6*(3+2)]² /3*2
		double a = 6 * (3 + 2);
		double aPow = Math.pow(a, 2);
		// ----------------------------
		double aBellow = 3 * 2;
		double respA = aPow / aBellow;

		// b >> ((1-5)*(2-7) / 2)²
		double b = (1 - 5) * (2 - 7);
		double bBellow = b / 2;
		double bPow = Math.pow(bBellow, 2);
		double respB = bPow;

		// c >> (a-b)³
		double c = respA - respB;
		double cPow = Math.pow(c, 3);
		double respC = cPow;

		// d >> respC / 10³;
		double dBlow = Math.pow(10, 3);
		int d = (int) (respC / dBlow);
		System.out.println(d);

	}
}
