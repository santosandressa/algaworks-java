package orientacaoObjeto2;

public class TesteContador {

	public static void main(String[] args) {
		// Contador.COUNTS++;
		// int valorDoCount = Contador.COUNT;
		// System.out.println(valorDoCount);

		Contador c = new Contador();
		c.incrementar();
		System.out.println(Contador.COUNT);

	}

}
