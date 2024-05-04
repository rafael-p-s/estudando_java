package desafioConstrutorData;

public class desafioDataTeste_Object {
public static void main(String[] args) {
	desafioData data = new desafioData(24,4,1993);
	System.out.printf("Data %d/%d/%d ",data.day,data.month,data.year);
	
	System.out.println();
	
	desafioData data2 = new desafioData();
	System.out.println("Data 1/1/1970 ");
}
}
