package br.com.alura.java3.modelo;

public class ImprimeZuds implements Runnable {

	private Zuds zoa;
	
	@Override
	public void run() {
		try {
			zoa.imprimeZuds();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public ImprimeZuds(Zuds zuds) {
		this.zoa = zuds;
	}

}
