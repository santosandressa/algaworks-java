package orientacaoObjeto.valoresPadrao;

public class Teste {
	public static void main(String[] args) {
		Carro seuCarro = new Carro();

		seuCarro.anoDeFabricacao = 2009;
		seuCarro.cor = "Preto";

		seuCarro.dono.nome = "José Pereira";
	}
}
