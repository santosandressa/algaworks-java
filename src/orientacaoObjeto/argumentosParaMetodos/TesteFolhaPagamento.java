package orientacaoObjeto.argumentosParaMetodos;

public class TesteFolhaPagamento {

	public static void main(String[] args) {

		FolhaPagamento folha = new FolhaPagamento();
		double salario = folha.calcularSalario(160, 12, 32.5, 40.2);

		System.out.println("Salario calculado: " + salario);

	}

}
