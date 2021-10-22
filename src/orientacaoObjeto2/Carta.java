package orientacaoObjeto2;

public class Carta {
	
	private Integer numero;
	private NaipeEnum naipe;
	
	public Carta(int numero, NaipeEnum naipe) {
		this.numero= numero;
		this.naipe= naipe;
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public NaipeEnum getNaipe() {
		return naipe;
	}

	public void setNaipe(NaipeEnum naipe) {
		this.naipe = naipe;
	}

	public void imprirmirCarta() {
		System.out.println("Sou " + numero +" de " + naipe + " e minha cor e: " + naipe.getCor());
	}
}
