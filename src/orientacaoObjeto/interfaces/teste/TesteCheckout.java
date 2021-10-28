package orientacaoObjeto.interfaces.teste;

import orientacaoObjeto.interfaces.caixa.Checkout;
import orientacaoObjeto.interfaces.caixa.Compra;
import orientacaoObjeto.interfaces.impressao.Impressora;
import orientacaoObjeto.interfaces.impressao.ImpressoraEpson;
import orientacaoObjeto.interfaces.pagamento.Cartao;
import orientacaoObjeto.interfaces.pagamento.Cielo;
import orientacaoObjeto.interfaces.pagamento.Operadora;

public class TesteCheckout {

	public static void main(String[] args) {
	Operadora operadora = new Cielo();
	Impressora impressora = new ImpressoraEpson();
	
	Cartao cartao  = new Cartao();
	cartao.setNomeTitular("Jao M Couves");
	cartao.setNumeroCartao("123 87326 98347");
	
	Compra compra = new Compra();
	compra.setNomeCliente("Joao Mendonca Couves");
	compra.setProduto("Sabonete");
	compra.setValorTotal(2.5);

	Checkout checkout = new Checkout(operadora, impressora);
	checkout.fecharCompra(compra, cartao);
	}

}
