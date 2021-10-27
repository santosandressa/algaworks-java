package ternario;

import java.util.Scanner;

public class OperadorTernario {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite sua idade: ");
		int idade = scanner.nextInt();
		
		//       expressao booleana  valor caso true   valor caso false
		String indicacao = (idade >= 18) ?  "Adulto" : "crianca/adolescente";
		
		System.out.println(indicacao);
		
		scanner.close();
	}

}
