package QUESTAO_4;

public class Adapter extends Adaptee implements ITarget {
	private int value;
	
	public Adapter(int value) {
		this.value = value;
	}
	
	@Override
	public void Request() {
		// TODO Auto-generated method stub
		this.SpecificRequest(value);
		
	}

}
