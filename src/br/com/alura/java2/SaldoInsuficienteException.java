package br.com.alura.java2;

@SuppressWarnings("serial")
public class SaldoInsuficienteException extends RuntimeException {

	private double saldoAtual;

	public SaldoInsuficienteException(double saldoAtual) {
		super("Saldo Insuficiente: " + saldoAtual);
		this.saldoAtual = saldoAtual;
	}

	public double getSaldoAtual() {
		return saldoAtual;
	}

}