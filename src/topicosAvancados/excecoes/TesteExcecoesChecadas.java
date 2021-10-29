package topicosAvancados.excecoes;

public class TesteExcecoesChecadas {

	public static void main(String[] args) {

		ContaCorrente cc = new ContaCorrente(100);

		try {
			cc.sacar(60);
		} catch (SaldoInsuficienteException e) {
			e.printStackTrace();
		}
		System.out.println("Saldo: " + cc.getSaldo());

		try {
			cc.sacar(10);
		} catch (SaldoInsuficienteException e) {
			e.printStackTrace();
		} finally {
			System.out.println("Obrigado por utilizar nosso sistema!");
		}
		
		System.out.println("Saldo agora: " + cc.getSaldo());

	}

}
