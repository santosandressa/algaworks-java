package orientacaoObjeto.variaveisObjetos.heranca;

// aula heranca e construtores
public class Pessoa {
	
	private String nome;
	private Integer idade;
	
	//construtor
	Pessoa(String nome){
		this.nome= nome;
	}
	
	Pessoa(String nome, Integer idade){
		this(nome); //executa o outro construtor
		this.idade= idade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getIdade() {
		return idade;
	}

	public void setIdade(Integer idade) {
		this.idade = idade;
	}
	
	public void seApresentar() {
		System.out.println("Ola, Eu sou o " + nome + ", e tenho " + idade + " anos.");
	}
	
	
}
