package br.com.alura.java2;

public class SistemaInterno {

	public void autentica(Autenticavel f) {
		int senha = 123;
		if (f.autentica(senha) == true) {
			System.out.println("Bem vindo ao sistema!");
		} else {
			System.out.println("Usuário Inválido!");
		}
	}

}
