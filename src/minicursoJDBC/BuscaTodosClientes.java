package minicursoJDBC;

import java.util.List;

import minicursoJDBC.dao.ClienteDAO;
import minicursoJDBC.dao.DAOFactory;
import minicursoJDBC.model.Cliente;

public class BuscaTodosClientes {

	public static void main(String[] args) {
		ClienteDAO clienteDAO = DAOFactory.getDAOFactory().getClienteDAO();

		List<Cliente> clientes = clienteDAO.buscarTodos();

		for (Cliente cliente : clientes) {
			System.out.println("-----Clientes------");
			System.out.printf("Codigo: %d\n", cliente.getCodigo());
			System.out.printf("Nome: %s\n", cliente.getNome());
			System.out.println();
		}

	}

}
