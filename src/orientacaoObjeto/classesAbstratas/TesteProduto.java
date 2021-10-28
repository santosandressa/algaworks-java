package orientacaoObjeto.classesAbstratas;

public class TesteProduto {

	public static void main(String[] args) {
		ProdutoPerecivel produtop = new ProdutoPerecivel();
		produtop.descricao= "Caixa de bombons";
		produtop.dataValidade= "20/11/2023";

		produtop.imprimirDescricao();
	}

}
