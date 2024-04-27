package desafioData;

public class DataTeste {
	public static void main(String[] args) {
		Data data1 = new Data();
		data1.mes = "Abril";
		data1.dia = 24;
		data1.ano = 1993;
		
		Data data2 = new Data();
		data2.mes = "Setembro";
		data2.dia = 17;
		data2.ano = 1958;
		
		Integer dia1 = data1.dia;
		String mes1 = data1.mes;
		Integer ano1 = data1.ano;
		
		Integer dia2 = data2.dia;
		String mes2 = data2.mes;
		Integer ano2 = data2.ano;
		
		
		System.out.printf("Data 1: %d/%s/%d",dia1,mes1,ano1);
		System.out.println();
		System.out.printf("Data 2: %d/%s/%d",dia2,mes2,ano2);
	
	}
	
}
