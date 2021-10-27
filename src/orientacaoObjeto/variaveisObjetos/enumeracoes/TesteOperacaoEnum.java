package orientacaoObjeto.variaveisObjetos.enumeracoes;

public class TesteOperacaoEnum {

	public static void main(String[] args) {

		OperacaoAritmeticaEnum o1 = OperacaoAritmeticaEnum.ADICAO;

		int resultado1 = o1.operacao(5, 3);
		System.out.println("O resultado e: " + resultado1);

		for (OperacaoAritmeticaEnum oa : OperacaoAritmeticaEnum.values()) {
			System.out.println(oa + " -> " + oa.operacao(4, 2));
		}

	}

}
