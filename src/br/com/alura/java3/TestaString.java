package br.com.alura.java3;

/**
 * 
 * A classe {@code TestaString} tem como objetivo testar o m�todo
 * {@code replaceAll()} da classe {@code String}
 * 
 * 
 * @author Guilherme Bigois
 * @since IMPL1.0
 */
public class TestaString {

	/**
	 * M�todo principal para inicializa��o da classe
	 * 
	 * <p>
	 * In�cia a compila��o da classe {@code TestaString} instanciando uma vari�vel
	 * {@code s} do tipo {@code String}. Em seguida fazendo a altera��o dos
	 * caracteres {@code 1} para {@code 2} por meio do m�todo {@code replaceAll()}
	 * presente na classe {@code String} que retorna uma {@code String} para a
	 * variav�l {@code s}.
	 * </p>
	 * <p>
	 * Por fim, a sa�da de {@code s} � exibida pelo m�todo {@code println()} da
	 * classe {@code PrintStream}.
	 * </p>
	 * 
	 * @param args
	 *            N�o fa�o id�ia
	 */
	public static void main(String[] args) {
		String s = "fj11";
		s = s.replaceAll("1", "2");
		System.out.println(s);
	}

}
