package strings;

public class ExemploStringBuilder {

	public static void main(String[] args) {
		// String, StringBuilder
		
		String s = "Ola ";
		s = s + "Pessoal!";
		System.out.println(s);
		
		// Melhor jeito de se concatenar uma string 
		StringBuilder sb = new StringBuilder("Ola ");
		sb.append("Pessoal!");
		
		String resultado = sb.toString();
		System.out.println("Com StringBuilder: " + resultado);
	}

}
