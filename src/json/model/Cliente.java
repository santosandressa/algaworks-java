package json.model;

import java.util.List;

public class Cliente {

	private String nome;
	private Integer idade;
	private Endereco endereco;
	private List<Telefone> telefones;

	public Cliente() {
		super();
	}

	public Cliente(String nome, Integer idade, Endereco endereco, List<Telefone> telefones) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.endereco = endereco;
		this.telefones = telefones;
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

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public List<Telefone> getTelefones() {
		return telefones;
	}

	public void setTelefones(List<Telefone> telefones) {
		this.telefones = telefones;
	}

}
