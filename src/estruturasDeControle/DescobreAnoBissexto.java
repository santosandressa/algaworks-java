package estruturasDeControle;

import java.util.Scanner;

public class DescobreAnoBissexto {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("Ano: ");
		Integer ano = scanner.nextInt();

		if (ano % 400 == 0) {
			System.out.println("O ano " + ano + " e um ano bissexto");
		} else if (ano % 4 == 0) {
			if (ano % 100 != 0) {
				System.out.println("O ano " + ano + " e um ano bissexto");
			} else {
				System.out.println("O ano " + ano + " nao e um ano bissexto");
			}
		} else {
			System.out.println("O ano " + ano + " nao e um ano bissexto");
		}

		scanner.close();

	}
}