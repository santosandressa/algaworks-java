package orientacaoObjeto;

public class TesteProduto {

	public static void main(String[] args) {
		//argumentos por valor ou referencia
		Preco preco = new Preco();
		preco.valorCustos = 140;

		Produto produto = new Produto();
		produto.definirPreco(preco, 20, 15);

		System.out.println("Valor custos: " + preco.valorCustos);
		System.out.println("Valor impostos: " + preco.valorImpostos);
		System.out.println("Valor lucro: " + preco.valorLucro);
		System.out.println("Preço venda: " + preco.precoVenda);
	}

}
