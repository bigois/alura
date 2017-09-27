package br.com.alura.java3;

/**
 * A classe {@code TestaTudo} tem como objetivo testar o m�todos est�ticos nela
 * criados.
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
		String s1 = "Familiares";
		s = s.replaceAll("1", "2");
		System.out.println("A String est� vazia: " + estaVazio(s));
		System.out.println("A palavra vida est� dentro de viver? " + temAPalavra(s, "vida"));
		System.out.println(s.trim() + " tem " + qntdChar(s.trim()) + " caracteres");
		palavraNaVertical(s);
		System.out.println(palavraComHifen(s1));
		System.out.println("Eu gosto de " + inverte("roma"));
		inverteComStringBuilder(s1);
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
	}h

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

	/**
	 * Exibe uma {@code String} na vertical
	 * 
	 * @param palavra
	 *            Palavra a ser convertida
	 */
	public static void palavraNaVertical(String palavra) {
		for (int i = 0; i < palavra.length(); i++) {
			System.out.println(palavra.charAt(i));
		}
	}

	/**
	 * Efetua a separa��o dos caracteres da {@code String} com h�fens
	 * 
	 * @param palavra
	 *            Palavra a ser hifenizada
	 * @return Retorna a palavra hifenizada
	 */
	public static String palavraComHifen(String palavra) {
		String novaPalavra = "";
		for (int i = 0; i < palavra.length(); i++) {
			if (i == (palavra.length() - 1)) {
				novaPalavra += String.valueOf(palavra.charAt(i));
			} else {
				novaPalavra += String.valueOf(palavra.charAt(i) + "-");
			}
		}
		return novaPalavra;
	}

	/**
	 * Inverte a {@code String}
	 * 
	 * @param palavra
	 *            {@code String} a ser invertida
	 * @return {@code String} invertida
	 */
	private static String inverte(String palavra) {
		String invertida = "";
		for (int i = palavra.length() - 1; i >= 0; i--) {
			invertida += String.valueOf(palavra.charAt(i));
		}
		return invertida;
	}
	
    public static void inverteComStringBuilder(String texto) {
        StringBuilder invertido = new StringBuilder(texto).reverse();
        System.out.println(invertido);
    }

}
