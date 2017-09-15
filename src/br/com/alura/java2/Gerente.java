package br.com.alura.java2;

public class Gerente extends Funcionario {

	@Override
	public double getBonus() {
		return this.salario * 0.35;
	}

	public void cobraRelatorios() {
		System.out.println("Preciso dos relatórios!");
	}

}
