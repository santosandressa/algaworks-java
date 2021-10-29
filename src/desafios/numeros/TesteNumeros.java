package desafios.numeros;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.Scanner;

public class TesteNumeros {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		DecimalFormat formatador = new DecimalFormat("R$ #,##0.00");
		
		System.out.print("Valor do produto: ");
		Double valorProduto = scanner.nextDouble();
		
		BigDecimal bg = new BigDecimal(valorProduto);
		BigDecimal resultado = bg.multiply(BigDecimal.TEN).divide(new BigDecimal(100));
		
		String novoValor = formatador.format(resultado.doubleValue());
		System.out.println("10% do valor e: " + novoValor);
		
		scanner.close();
		
	}
}
