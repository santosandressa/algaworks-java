package orientacaoObjeto.classesAbstratas;

public class TesteProduto2 {
	public static void main(String[] args) {
		
		Produto2 p = new ProdutoPerecivel2();
		p.descricao = "Caixa de Leite";
		
		ProdutoPerecivel2 pp = (ProdutoPerecivel2) p;
		pp.dataValidade = "10/03/12";
		
		p.imprimirDescricao();
		
	}
}
