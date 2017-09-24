package br.com.alura.java2;

@SuppressWarnings("serial")
public class ValorInvalidoException extends RuntimeException {

	public ValorInvalidoException(double valor) {
		super("Valor inválido: " + valor);
	}

}
