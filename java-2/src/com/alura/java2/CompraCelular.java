package com.alura.java2;

public class CompraCelular {
	private double preco;

	public double exibeValor() {
		return preco;
	}
	
	public void definePreco(float valor) {
		this.preco = valor;
	}
	
	public void compraCelular(float dinheiro) throws Exception {
		if (dinheiro >= preco) {
			System.out.println("Aparelho comprado com sucesso!");
		} else {
			throw new SaldoInsuficienteException(dinheiro);
		}
	}
	
	
}
