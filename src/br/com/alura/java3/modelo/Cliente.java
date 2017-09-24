package br.com.alura.java3.modelo;

public class Cliente implements Autenticavel {
	private String nome;
	private String endereco;

	@Override
	public boolean autentica(int senha) {
		return false;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

}
