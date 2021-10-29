package topicosAvancados.strings;

public class TesteString {

	public static void main(String[] args) {
		// String, StringBuilder e StringBuffer
		
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
