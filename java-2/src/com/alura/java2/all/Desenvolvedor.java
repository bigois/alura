package com.alura.java2.all;

public class Desenvolvedor extends Funcionario {

	@Override
	public double getBonus() {
		return this.salario * 0.25;
	}
	
}
