package topicosAvancados.excecoes;

public class TesteConta {

	public static void main(String[] args) {
		ContaCorrente cc = new ContaCorrente(100);

		try {
			cc.depositar(0);
		} catch (IllegalArgumentException e) {
			System.out.println("Voce executou uma operacao ilegal = " + e.getMessage());
		}

	}

}
