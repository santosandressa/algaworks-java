package regex;

public class ReplaceString {

	public static void main(String[] args) {

		String texto = "O valor do produto e R$ @x@.";
		String novoTexto = texto.replaceAll("@x+@", "2.50");
		System.out.println(novoTexto);

	}

}
