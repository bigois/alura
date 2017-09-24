package com.alura.java2;

public class Conta {
	private double saldo;
	private String titular;
	private int agencia;
	private int numero;

	public void saca(double valor) throws Exception {
		if (saldo >= valor) {
			this.saldo -= valor;
		} else {
			throw new ValorInvalidoException(valor);
		}
		this.saldo -= valor;
	}

	public void deposita(double valor) {
		if (valor < 0) {
			throw new ValorInvalidoException(valor);
		} else {
			this.saldo += valor;
		}
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

	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

}
