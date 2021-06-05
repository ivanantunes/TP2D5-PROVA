package QUESTAO_10;

public class Start {

	public static void main(String[] args) {
		Subject subject = new Subject();
		
		new Mario(subject);
		new Luigi(subject);
		new Yoshi(subject);
		
		for (int i = 10; i >= 0; i--) {
			subject.setBombTimer(i);
		}

	}

}
