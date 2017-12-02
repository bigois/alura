package br.com.alura.java3.programa;

import java.util.Scanner;

import br.com.alura.java3.modelo.ImprimeZuds;
import br.com.alura.java3.modelo.Zuds;

public class TestaZuera {

	@SuppressWarnings("resource")
	public static void main(String[] args) throws InterruptedException {

		System.out.print("INFORME UM ADJETIVO: ");
		String palavra = new Scanner(System.in).next();
		String frase = "VOCÊ É " + palavra;
		System.out.println();

		Zuds zuds = new Zuds(frase.toCharArray());
		ImprimeZuds impZuds = new ImprimeZuds(zuds);

		Thread t1 = new Thread(impZuds);

		t1.start();

	}

}
