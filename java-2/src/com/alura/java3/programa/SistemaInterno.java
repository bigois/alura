package com.alura.java3.programa;

import com.alura.java3.modelo.Autenticavel;

public class SistemaInterno {

	public void autentica(Autenticavel f) {
		int senha = 123;
		if (f.autentica(senha) == true) {
			System.out.println("Bem vindo ao sistema!");
		} else {
			System.out.println("Usu�rio Inv�lido!");
		}
	}

}
