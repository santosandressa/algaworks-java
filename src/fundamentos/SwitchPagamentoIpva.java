package fundamentos;

import java.util.Scanner;

public class SwitchPagamentoIpva {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Digite o final da placa: ");
		int finalPlaca = scanner.nextInt();

		switch (finalPlaca) {
		case 1:
			System.out.println("Pagamento dia 11 de janeiro");
			break;
		case 2:
			System.out.println("Pagamento dia 12 de janeiro");
			break;
		case 3:
			System.out.println("Pagamento dia 13 de janeiro");
			break;
		case 4:
			System.out.println("Pagamento dia 14 de janeiro");
			break;
		case 5:
			System.out.println("Pagamento dia 15 de janeiro");
			break;
		case 6:
			System.out.println("Pagamento dia 18 de janeiro");
			break;
		default:
			System.out.println("Vencimento sem data, tente novamente");
		}

		scanner.close();
	}

}
