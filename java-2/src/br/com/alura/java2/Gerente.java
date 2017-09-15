package br.com.alura.java2;

public class Gerente extends FuncionarioAutenticavel {

	@Override
	public double getBonus() {
		return this.salario * 0.35;
	}

	public void cobraEntrega() {
		System.out.println("Está pronto?");
	}

}
