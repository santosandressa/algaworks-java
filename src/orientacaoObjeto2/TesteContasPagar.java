package orientacaoObjeto2;

public class TesteContasPagar {

	public static void main(String[] args) {
		Fornecedor imobiliaria = new Fornecedor();
		imobiliaria.setNome("Casa & Cia Negócios Imobiliários");

		Fornecedor mercado = new Fornecedor();
		mercado.setNome("Mercado do João");
		
		ContaPagar conta1 = new ContaPagar();
		conta1.setDescricao("Aluguel da matriz");
		conta1.setValor(1230.0);
		conta1.setDataVencimento("10/05/2012");
		conta1.setFornecedor(imobiliaria);
		
		ContaPagar conta2 = new ContaPagar("Compras do mês", 390.0, "19/05/2012",mercado);
		
		ContaPagar conta3 = new ContaPagar("Aluguel da filial", 700.0, "11/05/2012",mercado);
		
		conta1.pagar();
		conta2.pagar();
		conta3.pagar();

	}

}
