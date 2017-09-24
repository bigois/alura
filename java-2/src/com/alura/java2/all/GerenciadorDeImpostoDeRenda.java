package com.alura.java2.all;

public class GerenciadorDeImpostoDeRenda {
	private double total;

	public void adicionar(Tributavel t) {
		System.out.println("Adicionando tribut�vel: " + t);
		this.total += t.calcularTributos();
	}

	public double getTotal() {
		return total;
	}

}
