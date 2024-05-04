package desafioDataMetodo;

public class Data {
	Integer dia, mes, ano;
	
	String dataFinal() {
		return String.format("%d/%d/%d",dia,mes,ano);
	}
}
