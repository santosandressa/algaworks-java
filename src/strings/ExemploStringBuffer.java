package strings;

public class ExemploStringBuffer {

	public static void main(String[] args) {
		//thread safe
		StringBuffer sb = new StringBuffer();
		sb.append("Bem vindo ao curso de Java. ");
		sb.append("Fique a vontade para tirar suas duvidas. ");
		sb.append("Estamos aqui para te ajudar.");

		System.out.println(sb.toString());

		sb.insert(26, " da AlgaWorks");
		System.out.println(sb);

	}

}
