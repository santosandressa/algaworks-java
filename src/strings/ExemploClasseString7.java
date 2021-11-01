package strings;

public class ExemploClasseString7 {
	public static void main(String[] args) {
		
		String s = "andressasantosp0@gmail.com";
		int indice= s.indexOf('@');
		System.out.println(indice);
		
		String nome= "Ana";
		int novoIndice = nome.lastIndexOf('a');
		System.out.println(novoIndice);
	}
}
