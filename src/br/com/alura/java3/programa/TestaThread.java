package br.com.alura.java3.programa;

import br.com.alura.java3.modelo.ContaPoupanca;

public class TestaThread {

	public static void main(String[] args) throws InterruptedException {
		// BarraDeProgresso barra = new BarraDeProgresso();
		// Thread t1 = new Thread(barra);
		// t1.start();
		//
		// CopiadorDeArquivos copiador = new CopiadorDeArquivos();
		// Thread t2 = new Thread(copiador);
		// t2.start();
	
		ContaPoupanca c1 = new ContaPoupanca(500);
		FazDeposito acao = new FazDeposito(c1);
		
		Thread t1 = new Thread(acao);
		Thread t2 = new Thread(acao);
		
		t1.start();
		t2.start();
		
		t1.join();
		t2.join();
		
		System.out.println(c1.getValor());
		
	}

}
