package desafioDataMetodo;

import java.io.PrintStream;

public class Data {
	Integer dia;
	Integer mes;
	Integer ano;
	
	String dataFinal() {
		return String.format("%d/%d/%d",dia,mes,ano);
	}
}
