package QUESTAO_7;

public class Pessoa {

	private Pessoa() { }
	
	public static void locomover(EMovimento movimento) {
		
		PessoaSubject subject = new PessoaSubject();
		
		new Carro(subject);
		new Moto(subject);
		new Bicicleta(subject);
		
		if (EMovimento.ANDAR.equals(movimento)) {
			subject.notificaTransportAnda();
		} else {
			subject.notificaTransportFreia();
		}
		
	}
	
}
