package minicursoJDBC.dao;

import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


import minicursoJDBC.model.Cliente;

public class JdbcClienteDAO implements ClienteDAO {

	private Connection connection;

	public JdbcClienteDAO(Connection connection) {
		super();
		this.connection = connection;
	}

	@Override
	public void salvar(Cliente cliente) {
		try {
			String sql = String.format("insert into cliente(nome) values ('%s')", cliente.getNome());

			PreparedStatement stmt = this.connection.prepareStatement(sql);
			stmt.executeUpdate();
		} catch (SQLException e) {
			throw new DAOException("Erro ao salvar o cliente", e);
		} finally {
			try {
				this.connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

	}

	@Override
	public Cliente buscarPeloCodigo(Long codigo) {
		Cliente cliente = null;

		try {
			String sql = String.format("select * from cliente where codigo= %d", codigo);
			PreparedStatement stmt = this.connection.prepareStatement(sql);

			ResultSet rs = stmt.executeQuery();

			while (rs.next()) {
				cliente = new Cliente();
				cliente.setCodigo(rs.getLong("codigo"));
				cliente.setNome(rs.getString("nome"));
			}
		} catch (SQLException e) {
			throw new DAOException("Erro ao buscar cliente", e);
		} finally {
			try {
				this.connection.close();
			} catch (Exception e) {
			}
		}

		return cliente;
	}

	@Override
	public List<Cliente> buscarTodos() {
		List<Cliente> clientes = new ArrayList<>();
		try {
			String sql= "select * from cliente";
			PreparedStatement stmt= this.connection.prepareStatement(sql);
			
			ResultSet rs= stmt.executeQuery();
			
			while(rs.next()) {
				Cliente cliente = new Cliente();
				cliente.setCodigo(rs.getLong("codigo"));
				cliente.setNome(rs.getString("nome"));
				
				
				clientes.add(cliente);
			}
		}
		catch (SQLException e) {
			throw new DAOException("Erro ao buscar cliente", e);
		} finally {
			try {
				this.connection.close();
			} catch (Exception e) {
			}
		}
		return clientes;
	}

}
