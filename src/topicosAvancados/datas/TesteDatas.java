package topicosAvancados.datas;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TesteDatas {

	public static void main(String[] args) {

		Date hoje = new Date();
		System.out.println(hoje);

		DateFormat formatador = new SimpleDateFormat("dd/MM/yyyy HH:mm");
		System.out.println(formatador.format(hoje));

		String dataAniversario = "20/11/1985";
		DateFormat formatador2 = new SimpleDateFormat("dd/MM/yyyy");

		try {
			Date aniversario = formatador2.parse(dataAniversario);
			System.out.println(formatador2.format(aniversario));
		} catch (ParseException e) {
			System.out.println("Formato de data inválido");
		}

	}
}
