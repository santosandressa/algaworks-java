package minicursoJDBC;

import javax.swing.JOptionPane;

import minicursoJDBC.dao.ClienteDAO;
import minicursoJDBC.dao.DAOFactory;
import minicursoJDBC.model.Cliente;

public class SalvaCliente {

	public static void main(String[] args) throws Exception {
		Cliente cliente = new Cliente();

		String nome = JOptionPane.showInputDialog(null, "Nome do cliente: ", "Cadastro", JOptionPane.QUESTION_MESSAGE);

		if (nome != null) {
			cliente.setNome(nome);
		}

		cliente.setCodigo(1L);
		cliente.setNome(nome);

		ClienteDAO clienteDAO = DAOFactory.getDAOFactory().getClienteDAO();
		clienteDAO.salvar(cliente);
		System.out.println("Cliente salvo com sucesso");

	}

}
