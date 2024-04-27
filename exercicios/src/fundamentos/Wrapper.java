package fundamentos;

import java.util.Scanner;

public class Wrapper {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		//byte
		Byte b =100;
		Short s = 1000;
		Integer i = Integer.parseInt(entrada.next());
		Long l = 100000l;
		
		System.out.println(b.byteValue());
		System.out.println(s.toString());
		System.out.println(i);
		System.out.println(l/3);
		entrada.close();
		
		
		Float f = 123f;
		System.out.println(f);
		Double d = 124.5678;
		System.out.println(d);
		
		
		Boolean bo = Boolean.parseBoolean("true");
		System.out.println(bo);
		System.out.println(bo.toString().toUpperCase());
		
		Character c = '#';
		System.out.println(c+"...");
		
		
	}
}
