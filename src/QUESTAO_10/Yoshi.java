package QUESTAO_10;

public class Yoshi extends Observer {

	public Yoshi(Subject subject) {
		this.subject = subject;
		this.subject.attach(this);
	}
	
	@Override
	public void updateBombTime() {
		
		System.out.println("[Mensagem]: Yoshi Falta " + subject.getBombTimer() + "s Para Explosão.");
		
	}

}
