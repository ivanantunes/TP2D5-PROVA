package QUESTAO_5;

public class Pizzaiolo extends Cozinheiro  {

	@Override
	Comida criarComida() {
		// TODO Auto-generated method stub
		return new Pizza();
	}


	
}
