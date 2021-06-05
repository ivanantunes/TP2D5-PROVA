package QUESTAO_10;

import java.util.ArrayList;
import java.util.List;


public class Subject {

	private List<Observer> observers = new ArrayList<Observer>();
	private int bombTimer;
	
	public int getBombTimer() {
		return this.bombTimer;
	}
	
	public void setBombTimer(int bombTimer) {
		this.bombTimer = bombTimer;
		notifyPumpTime();
	}
	
	public void attach(Observer observer) {
		observers.add(observer);
	}
	
	public void notifyPumpTime() {
		
		if (this.bombTimer > 0) {
			for (Observer observer : observers) {
				observer.updateBombTime();
			}
		} else {
			System.out.println("Bomba Explodiu,os Agentes Não Serão mais Avisados.");
		}
		
	}
}
