package orientacaoObjeto2;

public class Pessoa {
	
	public String nome;
	public Integer idade;
	
	//construtor
	Pessoa(String nome){
		this.nome= nome;
	}
	
	Pessoa(String nome, Integer idade){
		this(nome); //executa o outro construtor
		this.idade= idade;
	}
	
}
