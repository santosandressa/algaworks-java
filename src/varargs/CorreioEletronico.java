package varargs;

public class CorreioEletronico {
	
	public void enviarEmail(String...emails) {
		for(String email: emails) {
			System.out.println("Email enviado para: " + email);
		}
	}
}
