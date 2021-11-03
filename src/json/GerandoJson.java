package json;

import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;

import json.model.Cliente;
import json.model.Endereco;
import json.model.Telefone;

public class GerandoJson {

	public static void main(String[] args) {

		Endereco endereco = new Endereco();
		endereco.setRua("Rua das aguas, 10");
		endereco.setCidade("Riberirao Preto");
		endereco.setEstado("SP");

		Telefone celular = new Telefone();
		celular.setTipo("celular");
		celular.setNumero("98765-5654");

		Telefone residencial = new Telefone();
		residencial.setTipo("Residencial");
		residencial.setNumero("2011-3435");
		List<Telefone> telefones = new ArrayList<>();
		telefones.add(residencial);
		telefones.add(celular);

		Cliente cliente = new Cliente();
		cliente.setNome("Maria");
		cliente.setIdade(28);
		cliente.setTelefones(telefones);
		cliente.setEndereco(endereco);

		Gson gson = new Gson();
		String json = gson.toJson(cliente);

		System.out.println(json);
		System.out.println();

		System.out.println("--------------------------------------------------------------");

		//O caminho reverso...
		Cliente c2 = gson.fromJson(json, Cliente.class);
		System.out.println(c2.getNome());
		System.out.println(c2.getTelefones().get(0).getNumero());
	}

}
