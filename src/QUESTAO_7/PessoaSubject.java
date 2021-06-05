package QUESTAO_7;

import java.util.ArrayList;
import java.util.List;

public class PessoaSubject {

	private List<Observer> observers = new ArrayList<Observer>();

	public void attach(Observer observer) {
		observers.add(observer);
	}
	
	public void notificaTransportAnda() {
		for (Observer observer : observers) {
			observer.anda();
		}
	}

	public void notificaTransportFreia() {
		for (Observer observer : observers) {
			observer.freia();
		}
	}
}
