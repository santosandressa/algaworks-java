package estruturasDeControle;

import java.util.Scanner;

public class IfElse {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Digite seu nome: ");
		String nome = scanner.nextLine();

		System.out.println("Oi " + nome);

		System.out.print("Peso: ");
		Double peso = scanner.nextDouble();

		System.out.print("Altura: ");
		Double altura = scanner.nextDouble();

		Double imc = peso / (altura * altura);

		if (imc < 18.5) {
			System.out.println("Abaixo do peso ideal");
		} else if (imc < 25) {
			System.out.println("Peso ideal");
		} else if (imc < 30) {
			System.out.println("Acima do peso");
		} else if (imc < 40) {
			System.out.println("Obesidade grau 1 e 2");
		} else if (imc > 40) {
			System.out.println("Obesidade grau 3");
		} else {
			System.out.println("digite um valor valido");
		}

		System.out.println("Seu IMC é: " + imc);
		scanner.close();

	}
}
