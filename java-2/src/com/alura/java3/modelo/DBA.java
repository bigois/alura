package com.alura.java3.modelo;

public class DBA extends Funcionario {
	
	@Override
	public double getBonus() {
		return this.salario * 0.1;
	}

}
