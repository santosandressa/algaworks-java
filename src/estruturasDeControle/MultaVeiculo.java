package estruturasDeControle;

import java.util.Scanner;

public class MultaVeiculo {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Tipo do veiculo (passeio, caminhao): ");
		String tipoVeiculo = scanner.nextLine();

		System.out.print("Velocidade maxima da via: ");
		int velocidadeMaxima = scanner.nextInt();

		System.out.print("Velocidade do veiculo: ");
		int velocidadeVeiculo = scanner.nextInt();

		if ((tipoVeiculo.equals("passeio") && velocidadeVeiculo > velocidadeMaxima * 1.1)
				|| (tipoVeiculo.equals("caminhao") && velocidadeVeiculo > velocidadeMaxima * 1.05)) {
			System.out.println("Multa");
		}

		scanner.close();
	}
}
