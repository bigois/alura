package br.com.alura.java3.excecao;

@SuppressWarnings("serial")
public class ValorInvalidoException extends RuntimeException {

	public ValorInvalidoException(double valor) {
		super("Valor inválido: " + valor);
	}

}
