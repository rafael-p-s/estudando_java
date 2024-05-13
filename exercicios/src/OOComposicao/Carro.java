package OOComposicao;

public class Carro {

//	Motor motor = new Motor();// I cant leave it as null
	Motor motor;//'Bilateral'

	//Constructor
	Carro (){
		this.motor = new Motor(this);//'O proprio objeto atual é o carro que vai ser passado'
	}
	
	void acelerar() {
		if (motor.fatorInjecao < 2.6) {
			motor.fatorInjecao += 0.4;
		}
	}

	void frear() {
		if (motor.fatorInjecao > 0.5) {
			motor.fatorInjecao -= 0.4;
			//Minimum is 600 rpm
		}
		// I need to be caution if the value is invalid.
	}

	void ligar() {
		motor.ligado = true;
	}

	void desligar() {
		motor.ligado = false;
	}

	boolean estaLigado() {
		return motor.ligado;
		// This create a connection with Motor and New Carro.
	}

}
