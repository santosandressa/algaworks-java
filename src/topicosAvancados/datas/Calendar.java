package topicosAvancados.datas;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;

public class Calendar {

	public static void main(String[] args) {

		GregorianCalendar c = new GregorianCalendar();
		GregorianCalendar novaData = new GregorianCalendar();

		c.set(GregorianCalendar.DAY_OF_MONTH, 29);
		c.set(GregorianCalendar.MONTH, 9);
		c.set(GregorianCalendar.YEAR, 2021);
		c.set(GregorianCalendar.HOUR_OF_DAY, 11);
		c.set(GregorianCalendar.MINUTE, 19);

		DateFormat formatador = new SimpleDateFormat("dd/MM/yyyy HH:mm");
		System.out.println(formatador.format(c.getTime()));

		novaData.set(GregorianCalendar.DAY_OF_MONTH, 31);
		novaData.set(GregorianCalendar.MONTH, 0);
		novaData.set(GregorianCalendar.YEAR, 2021);

		novaData.add(GregorianCalendar.DAY_OF_MONTH, 1);
		System.out.println(formatador.format(novaData.getTime()));
	}

}
