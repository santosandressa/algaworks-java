package topicosAvancados.JOptionPane;

import javax.swing.JOptionPane;

public class ExemploJOptionPane2 {

	public static void main(String[] args) {

		JOptionPane.showMessageDialog(null, "Atencao email invalido", "Atencao", JOptionPane.WARNING_MESSAGE);
		JOptionPane.showMessageDialog(null, "Informe o CPF", "Erro", JOptionPane.ERROR_MESSAGE);

		JOptionPane.showConfirmDialog(null, "Obrigado", "Obrigado", JOptionPane.PLAIN_MESSAGE);
	}

}
