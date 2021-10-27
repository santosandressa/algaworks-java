package orientacaoObjeto.metodosComRetorno;

import orientacaoObjeto.classe.Proprietario;

public class Carro {

	public String fabricante;
	public String modelo;
	public String cor;
	public Integer anoFabricacao; // 0
	
	Proprietario proprietario; // null

	// metodo
	public void ligar() {
		if (modelo != null) {
			System.out.println("Ligando o carro " + modelo);
		}
	}
}
