package orientacaoObjeto.variaveisObjetos.heranca;

public class TestePessoa {
	
	public static void main(String[] args) {
		Pessoa p1= new Pessoa("Joao");
		System.out.println("Nome: " + p1.getNome());
		
		Pessoa p2= new Pessoa("Maria", 22);
		System.out.println("Nome: " + p2.getNome() + " tem " + p2.getIdade() + " anos.");
	}
}
