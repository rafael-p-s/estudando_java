package fundamentos;

public class temperaturas {
	public static void main(String[] args) {
		//(F - 32) * 5/9 = C
		double f = 38;
		double c =0;
		final int padrao32 = 32;
		final double divisao = 5.0/9;
		c = (f-32)*divisao;
		
		System.out.println(c);
	}
}
