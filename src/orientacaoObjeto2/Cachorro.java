package orientacaoObjeto2;

public class Cachorro {
	
	// aula modificador de acesso default
	
	private String nome;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
	void sentar() {
		System.out.println("Sentando...");
	}
}
