package QUESTAO_6;

import java.util.List;

public class Ordenador implements AlgoritmoDeOrdenacao<String> {

	private AlgoritmoDeOrdenacao<String> alg;
	
	public Ordenador(AlgoritmoDeOrdenacao<String> alg) {
		this.alg = alg;
	}
	
	@Override
	public List<String> ordena(List<String> list) {
		return alg.ordena(list);
	}

}
