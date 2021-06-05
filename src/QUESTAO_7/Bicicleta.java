package QUESTAO_7;

public class Bicicleta extends Observer {

	public Bicicleta(PessoaSubject subject) {
		this.subject = subject;
		this.subject.attach(this);
	}
	
	@Override
	public void anda() {
		System.out.println("Anda - Bicicleta");
	}

	@Override
	public void freia() {
		System.out.println("Freia - Bicicleta");
	}

}
