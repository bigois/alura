package br.com.alura.java2;

public class TestaConta {

	public static void main(String[] args) {
		Conta joao = new Conta();
		joao.deposita(50.0);
		try {
			joao.saca(100);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		System.out.println(joao.getSaldo());
	}

}
