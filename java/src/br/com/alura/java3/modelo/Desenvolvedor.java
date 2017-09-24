package br.com.alura.java3.modelo;

public class Desenvolvedor extends Funcionario {

	@Override
	public double getBonus() {
		return this.salario * 0.25;
	}

}
