package desafios.datas;

import java.util.Date;
import java.util.GregorianCalendar;

public class CalculadoraGravidez {
	
	private Date dataUltimoPeriodoMenstrual;

	public CalculadoraGravidez(Date dataUltimoPeriodoMenstrual) {
		this.dataUltimoPeriodoMenstrual = dataUltimoPeriodoMenstrual;
	}
	
	private GregorianCalendar converterDateParaCalendar(Date data) {
		GregorianCalendar calendar = new GregorianCalendar();
		calendar.setTime(data);
		return calendar;
	}
	
	public Date calcularDataEstimadaConcepcao() {
		GregorianCalendar dataEstimadaDaConcepcao = this.converterDateParaCalendar(this.dataUltimoPeriodoMenstrual);
		dataEstimadaDaConcepcao.add(GregorianCalendar.WEEK_OF_YEAR, 2);
		
		return dataEstimadaDaConcepcao.getTime();
	}
	
	public Date calcularDataEstimadaParto() {
		GregorianCalendar dataEstimadaParto = this.converterDateParaCalendar(this.dataUltimoPeriodoMenstrual);
		dataEstimadaParto.add(GregorianCalendar.WEEK_OF_YEAR, 40);
		
		return dataEstimadaParto.getTime();
	}
}
