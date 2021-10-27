package entradaDeDados;

import java.util.Scanner;

public class EntradaDeDados {

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

		System.out.println("Seu IMC é: " + imc);
		scanner.close();

	}

}
