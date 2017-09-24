package com.alura.java2.all;

public class TestaGerenciadorDeImpostoDeRenda {

	public static void main(String[] args) {
		GerenciadorDeImpostoDeRenda gerenciador = new GerenciadorDeImpostoDeRenda();
		SeguroDeVida sv = new SeguroDeVida();
		ContaCorrente cc = new ContaCorrente();
		gerenciador.adicionar(cc);
		gerenciador.adicionar(sv);
		System.out.printf("O saldo : R$ %.2f", cc.getSaldo());
	}

}
