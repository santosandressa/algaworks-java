package orientacaoObjeto.variaveisObjetos.enumeracoes;

public enum NaipeEnum {

	OURO("Vermelho"), COPAS("Preto"), PAUS("Preto"), ESPADA("Vermelho");
	
	private String cor;
	
	NaipeEnum(String cor){
		this.cor= cor;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}
	
	
}
