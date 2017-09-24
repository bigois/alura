package com.alura.java2.all;

public class TestaCompraCelular {

	public static void main(String[] args) {
		CompraCelular celular = new CompraCelular();
		celular.definePreco(500);
		try {
			celular.compraCelular(100);
		} catch (SaldoInsuficienteException e) {
			System.out.println("Saldo está insuficiente: R$ " + e.getSaldoAtual());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
