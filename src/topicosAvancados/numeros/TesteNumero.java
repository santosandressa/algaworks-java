package topicosAvancados.numeros;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.ParseException;

public class TesteNumero {

	public static void main(String[] args) {

		DecimalFormat formatador = new DecimalFormat("R$ #,##0.00");
		Double valorProduto = 1300.59;
		System.out.println(formatador.format(valorProduto));

		String entrada = "R$ 50,34";
		try {
			double numero = formatador.parse(entrada).doubleValue();
			System.out.println("Numero: " + formatador.format(numero));
		} catch (ParseException e) {
			System.out.println("Entrada invalida.");
		}
		
		BigDecimal bg = new BigDecimal(5000);
		bg = bg.divide(BigDecimal.TEN);
		System.out.println(bg);
	}

}
