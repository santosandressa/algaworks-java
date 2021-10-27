package orientacaoObjeto.metodos;

import orientacaoObjeto.classe.Proprietario;

public class Carro {
	String fabricante;
	String modelo;
	String cor;
	int anoDeFabricacao;

	Proprietario dono;
	
	void ligar() {
		System.out.println("Ligando o carro: " + modelo);
	}
}
