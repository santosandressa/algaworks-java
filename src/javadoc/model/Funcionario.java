package javadoc.model;

/**
 * 
 * @author Andressa Santos
 *
 */

public class Funcionario {

	private String nome;
	private Double salario;

	public Funcionario() {
		super();

	}

	public Funcionario(String nome, Double salario) {
		super();
		this.nome = nome;
		this.salario = salario;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getSalario() {
		return salario;
	}

	public void setSalario(Double salario) {
		this.salario = salario;
	}

	/**
	 * Calcula o adiantamento em dinheiro que deverá ser pago ao funcionário.
	 * 
	 * <p>
	 * O valor da diaria é calculado dividindo-se o <b>salário base por 30 (dias do
	 * mês)</b>.
	 * </p>
	 * 
	 * Caso o destino for uma capital, é adicionado 20% no valor do adiantamento.
	 * 
	 * @param dias    Quantidade de dias da viagem
	 * 
	 * @param capital Indica se é ou não uma capital brasileira
	 * @return O valor em reais do adiantamento
	 * 
	 * @throws IllegalArgumentException Caso {@code dias} for menor ou igual a zero
	 * 
	 * 
	 * @see Viagem
	 */

	public double adiatamentoViagem(int dias, boolean capital) {
		if (dias <= 0) {
			throw new IllegalArgumentException("Dias deve ser maior que zero.");
		}

		double valorDiaria = salario / 30;

		double valorAdiantamento = valorDiaria * dias;

		if (capital) {
			valorAdiantamento *= 1.20;
		}

		return valorAdiantamento;
	}

}
