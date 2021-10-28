package orientacaoObjeto.classesAbstratas;

public class ProdutoPerecivel2 extends Produto2{
	
	String dataValidade; 
	
	public void imprimirDescricao() {
		//Digitar a lógica...
		System.out.println("Descrição: " + super.getDescricao() + ". Vencendo em: " + dataValidade);
	}
}
