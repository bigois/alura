package br.com.alura.java2;

public class Gerente extends Funcionario implements Autenticavel {

	@Override
	public double getBonus() {
		return this.salario * 0.35;
	}

	public void cobraEntrega() {
		System.out.println("Está pronto?");
	}

	@Override
	public boolean autentica(int senha) {
		return false;
	}

}
