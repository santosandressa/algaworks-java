package topicosAvancados.JOptionPane;

import javax.swing.JOptionPane;

public class ExemploJOptionPane3 {

	public static void main(String[] args) {

		Object[] opcoes = { "Sim", "Nao" };

		int opcaoSelecionada = JOptionPane.showOptionDialog(null, "Voce gostaria de finalizar o cadastro?",
				"Confirmar cadastro", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, opcoes, opcoes[0]);

		System.out.println(opcaoSelecionada);

	}

}
