package orientacaoObjeto;

public class TesteCarro2 {

	public static void main(String[] args) {

		Proprietario dono1 = new Proprietario();
		dono1.nome = "Joao da Silva";

		Carro meuCarro = new Carro();
		meuCarro.modelo = "Palio";

		meuCarro.proprietario = dono1;
		System.out.println("meuCarro.proprietario.nome: " + meuCarro.proprietario.nome);
		System.out.println("dono1.nome: " + dono1.nome);
		
		
		meuCarro.ligar();
	}

}
