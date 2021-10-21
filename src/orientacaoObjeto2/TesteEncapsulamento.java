package orientacaoObjeto2;

public class TesteEncapsulamento {

	public static void main(String[] args) {
		ArCondicionado ar = new ArCondicionado();
		ar.setTemperatura(20);

		System.out.println("Temperatura do ar: " + ar.getTemperatura());

	}

}
