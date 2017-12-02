package br.com.alura.java3.modelo;

public class BarraDeProgresso implements Runnable {

	@Override
	public void run() {
		for (int i = 0; i < 10000; i++) {
			System.out.println("Executando arquivos");
		}
	}

}
