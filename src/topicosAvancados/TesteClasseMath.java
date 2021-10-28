package topicosAvancados;

import static java.lang.Math.PI;
import static java.lang.Math.max;
import static java.lang.Math.min;

public class TesteClasseMath {

	public static void main(String[] args) {

		// Comprimento de uma circuferencia 2 x r x PI
		int raio = 4;
		double comprimento = 2 * raio * PI;
		System.out.println("Comprimento: " + comprimento);

		// Maximo e minimo
		Double[] precosProdutoA = { 30.20, 25.49 };
		Double maiorPreco = max(precosProdutoA[0], precosProdutoA[1]);
		Double menorPreco = min(precosProdutoA[0], precosProdutoA[1]);
		System.out.println("\nMaior preco: " + maiorPreco);
		System.out.println("Menor preco: " + menorPreco);

		// Potencia
		System.out.println("\n2²: " + Math.pow(2, 2));

		// Raiz Quadrada
		System.out.println("\nRaiz quadrada de 9: " + Math.sqrt(9));

		// Arredondamento ceil, floor e round
		double num = 5.68;
		System.out.println("\nMaior inteiro: " + Math.ceil(num));
		System.out.println("Menor inteiro: " + Math.floor(num));
		System.out.println("Arrendondando: " + Math.round(num));

		// Numeros aleatorios
		double numeroAleatorio = Math.random() * 100;
		System.out.println("\nNumero aleatorio: " + Math.round(numeroAleatorio));

	}

}
