package valorVSreferencia;

public class ValorVsReferencia {
	public static void main(String[] args) {
		// This is a primitive tips
		double a = 2;
		double b = a; // I'm granting 'a' for 'b' as if it were a value.

		a++;
		b--;
		System.out.println(a + " " + b); // a=3 b=1

		// In this case bellow, imagine I have the class Data
//	Data d1 = Data(1,6,2022); // I'm using here
		// Data d2 = d1; //I'm grating for reference (Object)

		// d1.dia = 31;
		// d2.mes = 12;
//		dia.ano = 2025;

		// If I try to show both d1 and d2, the same data will be shown.
	}
	
	//If in this place I put something here:
	//static void voltarDataParaVoltarPadrao(Data d){
//	d.dia = 1;
//	d.mes = 1;
//	d.ano = 1970;
	
	//And try to show this like this:
	// Syso(d1.obterDataFormatada());
	//Syso(d2.obterDataFormatada());
	
	//voltarDataParaVoltarPadrao(d1); ***
	
	//Syso(d1.obterDataFormatada());
	//Syso(d2.obterDataFormatada());
	
	//After putting ***, the rest of code will be change.
	

	
}
