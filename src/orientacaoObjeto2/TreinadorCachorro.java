package orientacaoObjeto2;

public class TreinadorCachorro {
	// aula modificador de acesso default
	
	public static void main(String[] args) {
		Cachorro cachorro = new Cachorro();
		cachorro.setNome("Bob");
		
		DonoCachorro dono = new DonoCachorro();
		dono.ensinarCachorroSentar(cachorro);
	}
	
}
