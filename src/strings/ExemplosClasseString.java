package strings;

public class ExemplosClasseString {

	public static void main(String[] args) {
		String nome = "Pedro";
		System.out.println(nome.toUpperCase());
		System.out.println(nome);

		nome = nome.toUpperCase();
		System.out.println(nome);
		
		//--------------------------------------
		
		//Como se comparar string
		String s1 = "Pedro";
		String s2 = "Pedro";
		System.out.println(s1.equals(s2));
		
		String s3= "PeDrO";
		System.out.println(s1.equalsIgnoreCase(s3));
	}

}
