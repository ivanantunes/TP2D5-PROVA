package QUESTAO_7;

public class Moto extends Observer {

	public Moto(PessoaSubject subject) {
		this.subject = subject;
		this.subject.attach(this);
	}
	
	@Override
	public void anda() {
		System.out.println("Anda - Moto");
	}

	@Override
	public void freia() {
		System.out.println("Freia - Moto");
	}

}
