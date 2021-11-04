package debug;

public class Fibonnaci {

	// f(n) = f(n-1) + f(n-2)
	public static Long calcular(Long posicao) {

		if (posicao == 1 || posicao == 2) {
			return 1L;
		}

		Long valor = calcular(posicao - 1) + calcular(posicao - 2);
		return valor;
	}

}
