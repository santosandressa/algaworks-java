package orientacaoObjeto.polimorfismo;

public class TestePolimorfismo {

	public static void imprimirSaldo(Conta conta) {
		System.out.println("Saldo da conta: R$" + conta.getSaldo());
		
		if(conta instanceof ContaCorrente) {
			ContaCorrente contac = (ContaCorrente) conta;
			System.out.println("O limite da conta corrente é: R$" + contac.getLimite());
		}
	}

	public static void main(String[] args) {
		Conta conta = new Conta();
		conta.setSaldo(4000);
		imprimirSaldo(conta);

		Conta cc = new ContaCorrente();
		cc.setSaldo(3500);
		imprimirSaldo(cc);
		
		Conta cp = new ContaPoupanca();
		cp.setSaldo(1200);
		imprimirSaldo(cp);
	}
}
