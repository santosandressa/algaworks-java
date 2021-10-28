package topicosAvancados.coletaDeLixo;

import orientacaoObjeto.classe.Carro;

public class TesteColetaDeLixo {

	@SuppressWarnings("null")
	public static void main(String[] args) {
		Carro carro = new Carro();
		carro.modelo = "Palio";

		// coleta de lixo
		carro = null;

		carro.anoDeFabricacao = 200; // <- Aparece uma null pointer exception

	}

}
