package orientacaoObjeto2;

public class TestePessoa {
	
	public static void main(String[] args) {
		Pessoa p1= new Pessoa("Joao");
		System.out.println("Nome: " + p1.nome);
		
		Pessoa p2= new Pessoa("Maria", 22);
		System.out.println("Nome: " + p2.nome + " tem " + p2.idade + " anos.");
	}
}
