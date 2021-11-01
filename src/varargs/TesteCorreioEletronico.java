package varargs;

public class TesteCorreioEletronico {

	public static void main(String[] args) {
		CorreioEletronico correio = new CorreioEletronico();

		// String[] emails = new String[3];
		// emails[0] = "joaodascouves@gmail.com";
		// emails[1] = "maria@gmail.com";
		// emails[2] = "pedro@gmail.com";
		// correio.enviarEmail(emails);

		// com varargs
		correio.enviarEmail("joao@gmail.com", "maria@maria.com");

	}

}
