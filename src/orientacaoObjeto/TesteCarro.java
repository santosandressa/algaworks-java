package orientacaoObjeto;

public class TesteCarro {

	public static void main(String[] args) {

		// instanciando Objeto

		Proprietario proprietario = new Proprietario();
		proprietario.nome = "Andressa";

		Carro carro = new Carro();
		carro.modelo = "hb20";
		carro.anoFabricacao = 2014;
		carro.cor = "Preto";
		carro.fabricante = "Hyundai";
		carro.proprietario = proprietario;
		// carro.proprietario = new Proprietario();

		System.out.println(carro.modelo);
		System.out.println(carro.proprietario.nome);
	}

}
