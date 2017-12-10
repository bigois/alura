package br.com.alura.java3.programa;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

import br.com.alura.java3.modelo.ContaPoupanca;

public class TestaOrdenacao01 {

	public static void main(String[] args) {
		ContaPoupanca cp1 = new ContaPoupanca(500.0);
		ContaPoupanca cp2 = new ContaPoupanca(300.0);
		ContaPoupanca cp3 = new ContaPoupanca(700.0);
		ContaPoupanca cp4 = new ContaPoupanca(200.0);

		List<ContaPoupanca> contas = new LinkedList<ContaPoupanca>();

		contas.add(cp1);
		contas.add(cp2);
		contas.add(cp3);
		contas.add(cp4);

		Collections.sort(contas);

		DecimalFormat real = new DecimalFormat("R$ ###.00");

		System.out.println("ORDENADO");
		for (ContaPoupanca contaPoupanca : contas) {
			System.out.println(real.format(contaPoupanca.getValor()));
		}

		Collections.reverse(contas);

		System.out.println("\nREVERSO");
		for (ContaPoupanca contaPoupanca : contas) {
			System.out.println(real.format(contaPoupanca.getValor()));
		}

		List<String> frase = new ArrayList<String>();
		frase.add("T");
		frase.add("H");
		frase.add("A");
		frase.add("N");
		frase.add("N");
		frase.add("K");
		frase.add("S");

		Collections.rotate(frase, -1);

		System.out.println("\nFRASE ROTACIONADA");
		for (String fr : frase) {
			System.out.println(fr);
		}

		Collections.shuffle(frase);

		System.out.println("\nFRASE EMBARALHADA");
		for (String fr : frase) {
			System.out.println(fr);
		}

		List<ContaPoupanca> listAL = new ArrayList<ContaPoupanca>();
		List<ContaPoupanca> listLL = new LinkedList<ContaPoupanca>();
		Random random =  new Random();
		
		for (int i = 0; i < 10; i++) {
			listAL.add(new ContaPoupanca(random.nextDouble() * 100000));
			listLL.add(new ContaPoupanca(random.nextDouble() * 100000));
		}
		
		Collections.sort(listAL);
		Collections.reverse(listAL);
		
		System.out.println("\nADIÇÃO MALUCA");
		for (ContaPoupanca contaPoupanca : listAL) {
			System.out.println(real.format(contaPoupanca.getValor()));
		}
		
		System.out.println("\nREFERÊNCIAS");
		System.out.println(listAL);
		System.out.println(listLL);
		
	}

}
