package br.com.alura.java3;

import java.io.PrintStream;
import br.com.alura.java3.modelo.ContaCorrente;

public class TestaInteger {

	public static void main(String[] args) {
		Integer x1 = new Integer(10);
		Integer x2 = new Integer(10);
		if (x1.equals(x2)) {
			System.out.println("igual");
		} else {
			System.out.println("diferente");
		}
		String valida = "1234";
		@SuppressWarnings("unused")
		String invalida = "a2c3";
		System.out.println(Integer.parseInt(valida));
		// System.out.println(Integer.parseInt(invalida));
		PrintStream saida = System.out;
		saida.println("ola");
		ContaCorrente conta = new ContaCorrente();
		System.out.println(conta);
	}

}
