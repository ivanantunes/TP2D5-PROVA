package QUESTAO_10;

public class Luigi extends Observer {

	public Luigi(Subject subject) {
		this.subject = subject;
		this.subject.attach(this);
	}
	
	@Override
	public void updateBombTime() {
		
		System.out.println("[Mensagem]: Luigi Falta " + subject.getBombTimer() + "s Para Explosão.");
		
	}

}
