package br.com.alura.java3.modelo;

public class ContaPoupanca {

	private double valor;

	public ContaPoupanca(double valor) {
		this.valor = valor;
	}

	public synchronized void deposita(double valor) {
		this.valor += valor;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

}
