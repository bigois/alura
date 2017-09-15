package br.com.alura.java2;

public class Cliente implements Autenticavel {
	private String nome;
	private String endereco;

	@Override
	public boolean autentica(int senha) {
		return false;
	}

}
