package array;

public class Array {

	public static void main(String[] args) {
		Integer[] notas = new Integer[4];
		notas[0] = 10;
		notas[1] = 5;
		notas[2] = 8;
		notas[3] = 9;

		for (int i = 0; i < notas.length; i++) {
			System.out.println("Posicao: [" + i + "]= " + notas[i]);
		}

	}

}
