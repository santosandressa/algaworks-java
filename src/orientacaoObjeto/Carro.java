package orientacaoObjeto;

public class Carro {

	public String fabricante;
	public String modelo;
	public String cor;
	public Integer anoFabricacao; // 0
	boolean flex; // false;
	Proprietario proprietario; // null

	// metodo
	public void ligar() {
		if (modelo != null) {
			System.out.println("Ligando o carro " + modelo);
		}
	}

	public void alterarModelo(String modelo) {
		if (modelo != null) {
			this.modelo = modelo;
		}
		;
	}
}
