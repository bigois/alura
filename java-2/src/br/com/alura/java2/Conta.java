package br.com.alura.java2;

public class Conta {
	private double saldo;
	private String titular;
	private int agencia;
	private int numero;

	public void saca(double valor) throws Exception {
		if (saldo >= valor) {
			this.saldo -= valor;
		} else {
			throw new Exception("Saldo insuficiente");
		}
		this.saldo -= valor;
	}

	public void deposita(double valor) {
		this.saldo += valor;
	}

	public String getTitular() {
		return titular;
	}
	
	public void setTitular(String titular) {
		this.titular = titular;
	}
	 
	public double getSaldo() {
		return saldo;
	}

}
