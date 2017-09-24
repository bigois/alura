package br.com.alura.java2;

public class Desenvolvedor extends Funcionario {

	@Override
	public double getBonus() {
		return this.salario * 0.25;
	}
	
}
