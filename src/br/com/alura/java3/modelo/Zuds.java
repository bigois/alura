package br.com.alura.java3.modelo;

public class Zuds extends Thread {

	private char zuds[];

	// CONSTRUTOR
	public Zuds(char palavra[]) {
		this.zuds = palavra;
	}

	public void imprimeZuds() throws InterruptedException {
		for (int i = 0; i < zuds.length; i++) {
			System.out.println(zuds[i]);
			Thread.sleep(1 * 1000);
		}
	}

	public char[] getZuds() {
		return zuds;
	}

	public void setZuds(char[] zuds) {
		this.zuds = zuds;
	}

}
