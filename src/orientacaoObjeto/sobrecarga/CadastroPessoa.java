package orientacaoObjeto.sobrecarga;

public class CadastroPessoa {
	
	public void cadastrar(Pessoa pessoa) {
		armazenar(pessoa.getNome(), pessoa.getIdade());
	}
	
	public void cadastrar(String nome, Integer idade) {
		armazenar(nome, idade);
	}
	private void armazenar(String nome, Integer idade) {
		System.out.println("Salvando: \"" + nome + "\" com " + idade + " anos.");
	}
}
