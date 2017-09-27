package br.com.alura.java3;

/**
 * A classe {@code TestaTudo} tem como objetivo testar o métodos estáticos
 * nela criados.
 * 
 * @author Guilherme Bigois
 * @since IMPL1.0
 */
public class TestasString {

	/**
	 * Método principal para inicialização da classe
	 * 
	 * @param args
	 *            Não faço idéia
	 */
	public static void main(String[] args) {
		String s = "  Escolaridade";
		s = s.replaceAll("1", "2");
		System.out.println("A String está vazia: " + estaVazio(s));
		System.out.println("A palavra vida está dentro de viver? " + temAPalavra(s, "vida"));
		System.out.println(s.trim() + " tem " + qntdChar(s.trim()) + " caracteres");
	}

	/**
	 * Retorna se a {@code String} está vazia ou não
	 * 
	 * @param palavra
	 *            Palavra a ser verificada
	 * @return status se está vazia ou não
	 */
	public static boolean estaVazio(String palavra) {
		boolean status = palavra.isEmpty();
		return status;
	}

	/**
	 * Retorna a quantidade de caracteres presente na {@code String}
	 * 
	 * @param palavra
	 *            Palavra a ser verificada
	 * @return Quantidade de caracteres
	 */
	public static int qntdChar(String palavra) {
		int qntdChar = palavra.length();
		return qntdChar;
	}

	/**
	 * Retorna se encontrou a palavra procurada na palavra raíz
	 * 
	 * @param palavra
	 *            Palavra raiz
	 * @param palavraProcurada
	 *            Palavra a ser procurada
	 * @return Status de verdadeiro ou falso da procura na palavra raíz
	 */
	public static boolean temAPalavra(String palavra, String palavraProcurada) {
		boolean status = palavra.contains(palavraProcurada);
		return status;
	}

	/**
	 * Retira os espaços em branco do começo e do fim da {@code String}
	 * 
	 * @param palavra
	 *            {@code String} à ser limpa
	 * @return {@code String} sem espaços no começo ou fim
	 */
	public static String limparEspacosComecoFim(String palavra) {
		String palavraLimpa = palavra.trim();
		return palavraLimpa;
	}

}
