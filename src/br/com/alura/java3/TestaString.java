package br.com.alura.java3;

/**
 * 
 * A classe {@code TestaString} tem como objetivo testar o método
 * {@code replaceAll()} da classe {@code String}
 * 
 * 
 * @author Guilherme Bigois
 * @since IMPL1.0
 */
public class TestaString {

	/**
	 * Método principal para inicialização da classe
	 * 
	 * <p>
	 * Inícia a compilação da classe {@code TestaString} instanciando uma variável
	 * {@code s} do tipo {@code String}. Em seguida fazendo a alteração dos
	 * caracteres {@code 1} para {@code 2} por meio do método {@code replaceAll()}
	 * presente na classe {@code String} que retorna uma {@code String} para a
	 * variavél {@code s}.
	 * </p>
	 * <p>
	 * Por fim, a saída de {@code s} é exibida pelo método {@code println()} da
	 * classe {@code PrintStream}.
	 * </p>
	 * 
	 * @param args
	 *            Não faço idéia
	 */
	public static void main(String[] args) {
		String s = "fj11";
		s = s.replaceAll("1", "2");
		System.out.println(s);
	}

}
