package orientacaoObjeto.classesAbstratas;

public class ProdutoPerecivel extends Produto {
	
	String descricao;
	String dataValidade;

	@Override
	public void imprimirDescricao() {
		System.out.println("Descricao: " + descricao + ". Vencendo em: " + dataValidade);
	}
}
