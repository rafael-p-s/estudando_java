package desafioDataMetodo;

public class DataTeste {
public static void main(String[] args) {
	Data d1 = new Data();
	d1.dia = 10;
	d1.mes = 4;
	d1.ano = 1993;
	
	
	System.out.printf(d1.dataFinal());
	
}
}
