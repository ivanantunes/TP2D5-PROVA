package QUESTAO_10;

public class Mario extends Observer {

	public Mario(Subject subject) {
		this.subject = subject;
		this.subject.attach(this);
	}
	
	@Override
	public void updateBombTime() {
		
		System.out.println("[Mensagem]: Mário Falta " + subject.getBombTimer() + "s Para Explosão.");
		
	}

}
