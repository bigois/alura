package br.com.alura.java3.programa;

import br.com.alura.java3.modelo.ContaPoupanca;

public class FazDeposito implements Runnable {

	private final ContaPoupanca contaPoupanca;

	@Override
	public void run() {
		contaPoupanca.deposita(100);
	}

	public FazDeposito(ContaPoupanca c1) {
		this.contaPoupanca = c1;
	}
	
}
