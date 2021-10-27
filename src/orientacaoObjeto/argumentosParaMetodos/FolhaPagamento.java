package orientacaoObjeto.argumentosParaMetodos;

public class FolhaPagamento {

	//argumentos para metodos
	double calcularSalario(int horasNormais, int horasExtras, 
			double valorHoraNormal, double valorHoraExtra) {
		double valorHorasNormais = horasNormais * valorHoraNormal;
		double valorHorasExtras = horasExtras * valorHoraExtra;
		
		return valorHorasNormais + valorHorasExtras;
	}
}
