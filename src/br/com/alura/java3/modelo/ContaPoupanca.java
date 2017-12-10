package br.com.alura.java3.modelo;

public class ContaPoupanca extends Conta implements Comparable<ContaPoupanca> {

	private double valor;
	protected int numero;

	public ContaPoupanca(double valor) {
		this.valor = valor;
	}

	public synchronized void deposita(double valor) {
		this.valor += valor;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	@Override
	public String toString() {
		return "ContaPoupanca [valor=" + valor + "]";
	}

	@Override
	public int compareTo(ContaPoupanca outra) {
		if (this.valor < outra.valor) {
			return -1;
		} else if (this.valor > outra.valor) {
			return 1;
		} else {
			return 0;
		}
	}

}
