package QUESTAO_7;

public class Carro extends Observer {

	public Carro(PessoaSubject subject) {
		this.subject = subject;
		this.subject.attach(this);
	}
	
	@Override
	public void anda() {
		System.out.println("Anda - Carro");
	}

	@Override
	public void freia() {
		System.out.println("Freia - Carro");
	}

}
