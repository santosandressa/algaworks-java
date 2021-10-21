package orientacaoObjeto2;

//Encapsulamento e modificadores de acesso
public class ArCondicionado {

	private Integer temperatura;
	
	public ArCondicionado() {
	}

	public Integer getTemperatura() {
		return temperatura;
	}

	public void setTemperatura(Integer temperatura) {
		if (temperatura >= 17 && temperatura <= 25) {
			this.temperatura = temperatura;
		}
	}

}
