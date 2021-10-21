package fundamentos;

import java.util.Scanner;

public class While {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Digite o numero inicial: ");
		int numeroInicial = scanner.nextInt();

		System.out.println("Digite o numero final: ");
		int numeroFinal = scanner.nextInt();

		int numeroAtual = numeroInicial;

		while (numeroAtual <= numeroFinal) {
			System.out.println(numeroAtual);
			numeroAtual++;
		}

		scanner.close();
	}
}
