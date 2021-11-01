package topicosAvancados.JOptionPane;

import javax.swing.JOptionPane;

public class ExemeploJOptionPane4 {

	public static void main(String[] args) {

		Object[] opcoes = { "Masculino", "Feminino", "Outro" };

		String sexo = (String) JOptionPane.showInputDialog(null, "Selecione o sexo", "Algaworks",
				JOptionPane.PLAIN_MESSAGE, null, opcoes, opcoes[0]);

		System.out.println(sexo);

	}

}
