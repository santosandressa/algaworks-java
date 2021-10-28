package desafios.classeMath;

import java.util.Scanner;

public class BolaoMegaSena {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Quantos jogos?: ");
		int quantidadeJogos = entrada.nextInt();

		System.out.println("----------------------------");
		
		for (int i = 1; i <= quantidadeJogos; i++) {
			MegaSena mega = new MegaSena();
			mega.sortear();
			mega.exibirNumeros();
			System.out.println("----------------------------");
		}
		
		System.out.println("*** Boa sorte! ***");
		entrada.close();

	}

}
