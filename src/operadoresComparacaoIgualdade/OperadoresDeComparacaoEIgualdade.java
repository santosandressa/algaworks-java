package operadoresComparacaoIgualdade;

public class OperadoresDeComparacaoEIgualdade {

	public static void main(String[] args) {
		// Comparação
		// >(maior), >= (maior ou igual)
		// < menor, <= (menor ou igual)

		// Igualdade
		// == (igual) e != (diferente)

		int a = 10;
		int b = 5;
		int c = 2;

		boolean maior = b > a;
		System.out.println(maior); // false

		boolean maiorOuIgual = b >= a;
		System.out.println(maiorOuIgual); // false

		boolean menor = a < b;
		System.out.println(menor); // false

		boolean menorOuIgual = a <= 10;
		System.out.println(menorOuIgual); // true

		boolean igual = a == b - c;
		System.out.println(igual); // false

		boolean diferente = a != c;
		System.out.println(diferente); // true
		
		boolean bloqueado = true;
		bloqueado = !bloqueado;
		System.out.println(bloqueado);

	}

}
