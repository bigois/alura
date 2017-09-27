package br.com.alura.java3.modelo;

import br.com.alura.java3.excecao.ValorInvalidoException;

/**
 * Classe modelo para conta
 * 
 * @author Guilherme Bigois
 * 
 */
public abstract class Conta {
	private double saldo;
	private String titular;
	private int agencia;
	private int numero;

	/**
	 * Construtor vázio
	 */
	public Conta() {
	}

	/**
	 * Construtor com todos os atributos
	 * 
	 * @param saldo
	 *            Saldo atual da conta
	 * @param titular
	 *            Nome do titular
	 * @param agencia
	 *            Número da agência
	 * @param numero
	 *            Número da conta
	 */
	public Conta(double saldo, String titular, int agencia, int numero) {
		super();
		this.saldo = saldo;
		this.titular = titular;
		this.agencia = agencia;
		this.numero = numero;
	}

	/**
	 * Retira um valor do saldo atual
	 * 
	 * @param valor
	 *            Valor a ser sacado
	 * @throws Exception
	 *             Lança um exceção em caso de passagem de valor inválida
	 */
	public void saca(double valor) throws Exception {
		if (saldo >= valor) {
			this.saldo -= valor;
		} else {
			throw new ValorInvalidoException(valor);
		}
		this.saldo -= valor;
	}

	/**
	 * Adiciona um novo valor ao saldo atual
	 * 
	 * @param valor
	 *            Valor a ser depositado
	 */
	public void deposita(double valor) {
		if (valor < 0) {
			throw new ValorInvalidoException(valor);
		} else {
			this.saldo += valor;
		}
	}

	/**
	 * Retorna o nome do titular da conta
	 * 
	 * @return Nome do titular da conta
	 */
	public String getTitular() {
		return titular;
	}

	/**
	 * Altera o nome do titular da cnta
	 * 
	 * @param titular
	 *            Novo nome para titular da conta
	 */
	public void setTitular(String titular) {
		this.titular = titular;
	}

	/**
	 * Retorna o saldo total da conta
	 * 
	 * @return Saldo total da conta
	 */
	public double getSaldo() {
		return saldo;
	}

	/**
	 * Retorna o número da agência da conta
	 * 
	 * @return Número da agência
	 */
	public int getAgencia() {
		return agencia;
	}

	/**
	 * Altera o número da agência
	 * 
	 * @param agencia
	 *            Novo número de agência
	 */
	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

	/**
	 * Retorna o número da conta
	 * 
	 * @return Número da conta
	 */
	public int getNumero() {
		return numero;
	}

	/**
	 * Altera o número da conta
	 * 
	 * @param numero
	 *            Novo número da conta
	 */
	public void setNumero(int numero) {
		this.numero = numero;
	}

}
