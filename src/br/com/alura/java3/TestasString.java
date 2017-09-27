package br.com.alura.java3;

/**
 * A classe {@code TestaTudo} tem como objetivo testar o m�todos est�ticos
 * nela criados.
 * 
 * @author Guilherme Bigois
 * @since IMPL1.0
 */
public class TestasString {

	/**
	 * M�todo principal para inicializa��o da classe
	 * 
	 * @param args
	 *            N�o fa�o id�ia
	 */
	public static void main(String[] args) {
		String s = "  Escolaridade";
		s = s.replaceAll("1", "2");
		System.out.println("A String est� vazia: " + estaVazio(s));
		System.out.println("A palavra vida est� dentro de viver? " + temAPalavra(s, "vida"));
		System.out.println(s.trim() + " tem " + qntdChar(s.trim()) + " caracteres");
	}

	/**
	 * Retorna se a {@code String} est� vazia ou n�o
	 * 
	 * @param palavra
	 *            Palavra a ser verificada
	 * @return status se est� vazia ou n�o
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
	 * Retorna se encontrou a palavra procurada na palavra ra�z
	 * 
	 * @param palavra
	 *            Palavra raiz
	 * @param palavraProcurada
	 *            Palavra a ser procurada
	 * @return Status de verdadeiro ou falso da procura na palavra ra�z
	 */
	public static boolean temAPalavra(String palavra, String palavraProcurada) {
		boolean status = palavra.contains(palavraProcurada);
		return status;
	}

	/**
	 * Retira os espa�os em branco do come�o e do fim da {@code String}
	 * 
	 * @param palavra
	 *            {@code String} � ser limpa
	 * @return {@code String} sem espa�os no come�o ou fim
	 */
	public static String limparEspacosComecoFim(String palavra) {
		String palavraLimpa = palavra.trim();
		return palavraLimpa;
	}

}
