package variaveis;

import java.util.Scanner;

public class EscopoVariaveis {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Idade: ");
		int idade = scanner.nextInt();

		boolean podeDirigir = idade >= 18;

		String nomePai = "";

		if (!podeDirigir) {
			System.out.println("Nome do pai: ");
			nomePai = scanner.next();

		}

		System.out.println("Voce pode dirigir?");
		if (podeDirigir) {
			System.out.println("Sim, claro");
		} else {
			System.out.println("Nao, se fizer isso, seu pai" + nomePai + "vai peso");
		}

		scanner.close();
	}

}
