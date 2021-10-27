package estruturasDeControle;

import java.util.Scanner;

public class For {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Ultimo numero: ");
		int numeroFinal = scanner.nextInt();

		for (int i = 1; i <= numeroFinal; i++) {
			System.out.println(i);
		}

		scanner.close();
	}

}
