package com.alura.java2;

public class TestaConta {

	public static void main(String[] args) {
		Conta joao = new Conta();
		try {
			joao.deposita(-50.0);
			joao.saca(100);
		} catch (ValorInvalidoException e) {
			System.out.println(e.getMessage());
		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println(joao.getSaldo());
		}
	}

}
