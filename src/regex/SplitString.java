package regex;

public class SplitString {

	public static void main(String[] args) {
		String texto = "O Java e uma linaguagem orientada a objetos.";

		String[] palavras = texto.split("\\d+");

		for (String palavra : palavras) {
			System.out.println(palavra);
		}

	}

}
