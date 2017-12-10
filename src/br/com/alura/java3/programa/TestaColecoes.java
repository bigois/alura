package br.com.alura.java3.programa;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;

import br.com.alura.java3.modelo.ContaPoupanca;

public class TestaColecoes {
	public static void main(String[] args) {

		/*
		 * List<String> nomes = new ArrayList<String>();
		 * 
		 * nomes.add("Guilherme"); nomes.add("Bernardo");
		 * 
		 * System.out.println(nomes.get(0));
		 * System.out.println(nomes.contains("Guilherme"));
		 * 
		 * for (String nome : nomes) { System.out.println(nome); }
		 * 
		 * Collections.sort(nomes);
		 * 
		 * System.out.println("ORDENADO"); for (String nome : nomes) {
		 * System.out.println(nome); }
		 * 
		 * List<ContaPoupanca> contas = new ArrayList<ContaPoupanca>();
		 * 
		 * ContaPoupanca c2 = new ContaPoupanca(700.0); ContaPoupanca c1 = new
		 * ContaPoupanca(1500.0);
		 * 
		 * contas.add(c1); contas.add(c2);
		 * 
		 * for (ContaPoupanca contaPoupanca : contas) {
		 * System.out.println(contaPoupanca); }
		 * 
		 * Collections.sort(contas);
		 * 
		 * System.out.println("ORDENADO"); for (ContaPoupanca contaPoupanca : contas) {
		 * System.out.println(contaPoupanca); }
		 * 
		 * Map<String, ContaPoupanca> mapaBanco = new HashMap<String, ContaPoupanca>();
		 * 
		 * ContaPoupanca c3 = new ContaPoupanca(700.0); ContaPoupanca c4 = new
		 * ContaPoupanca(1500.0);
		 * 
		 * mapaBanco.put("0108017", c3); mapaBanco.put("0411793", c4);
		 * 
		 * System.out.println(mapaBanco.get("0411793"));
		 * 
		 */

		List<Integer> listaNum = new ArrayList<Integer>();

		listaNum.add(1);
		listaNum.add(2);
		listaNum.add(3);
		listaNum.add(4);

		ListIterator<Integer> i = listaNum.listIterator();

		while (i.hasNext()) {
			System.out.println(i);
		}

	}

}
