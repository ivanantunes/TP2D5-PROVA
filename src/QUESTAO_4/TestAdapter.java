package QUESTAO_4;

public class TestAdapter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Client client = new Client();

		ITarget target = (ITarget) new Adapter(110);
		
		client.ClientMethod(target);

	}

}
