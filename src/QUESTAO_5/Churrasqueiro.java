package QUESTAO_5;

public class Churrasqueiro extends Cozinheiro {

	@Override
	Comida criarComida() {
		// TODO Auto-generated method stub
		return new Carne();
	}

	
}
