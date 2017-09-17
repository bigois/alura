package br.com.alura.java2;

public class CompraCelularException extends RuntimeException {
	private double saldoAtual;
	
	public CompraCelularException(double saldoAtual) {
		super("Saldo Insuficiente!");
		this.saldoAtual = saldoAtual;
	}

	public double getSaldoAtual() {
		return saldoAtual;
	}

}
