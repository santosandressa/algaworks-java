package wrappersBoxingArrays;

import java.util.Scanner;

class Produto {

	String descricao;
	int quantidade;

	void descrever() {
		System.out.println(descricao + " - " + quantidade + " itens");
	}

}

class Estoque {

	Produto[] produtos;

	void listarProdutos() {
		System.out.println("\nProdutos em estoque");
		System.out.println("------------------------");

		for (int i = 0; i < produtos.length; i++) {
			produtos[i].descrever();
		}
	}

}

public class TesteProdutos {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// obtém a quantidade de produtos que o usuário deseja informar
		System.out.println("Quantos produtos?");
		int quantidadeProdutos = scanner.nextInt();

		// Precisamos dessa linha extra para garantir que uma nova linha seja lida,
		// pois nextInt não lê uma nova linha, mas apenas um número.
		// Fica feio, mas tente não coloca-la para ver o que acontece.
		scanner.nextLine();

		// instancia um objeto da classe Estoque
		Estoque estoque = new Estoque();

		// instancia um array de produtos com a quantidade de
		// posições que o usuário informou
		estoque.produtos = new Produto[quantidadeProdutos];

		// percorre todas as posições no array (que estão nulas)
		// e preenche uma por uma com a scanner do teclado do usuário
		for (int i = 0; i < estoque.produtos.length; i++) {
			estoque.produtos[i] = new Produto();

			System.out.println("\nProduto " + i);
			System.out.println("------------------------");

			System.out.println("Descrição:");
			estoque.produtos[i].descricao = scanner.nextLine();

			System.out.println("Quantidade de itens:");
			estoque.produtos[i].quantidade = scanner.nextInt();
			scanner.nextLine();
		}

		estoque.listarProdutos();
		scanner.close();
	}

}
