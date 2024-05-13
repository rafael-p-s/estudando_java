package OOComposicao;

public class Motor {

	Carro carro;//For union 'Bilateral'
	boolean ligado = false;
	double fatorInjecao = 1; //engine rev

	//'Bilateral'
	Motor(Carro carro){
		this.carro = carro;
	}
	
	int giros() {
		if (!ligado) {
			return 0;
		}
		return (int) Math.round(fatorInjecao * 3000);
		// I need to do this /\, because I have a double and an int
	}

}
