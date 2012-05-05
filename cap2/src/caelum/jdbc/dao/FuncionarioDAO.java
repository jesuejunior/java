package caelum.jdbc.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import caelum.jdbc.ConnectionFactory;
import caelum.jdbc.exception.DAOException;
import caelum.jdbc.modelo.Funcionario;

public class FuncionarioDAO {
	private Connection connection;
	
	public FuncionarioDAO() {
		this.connection = new ConnectionFactory().getConnection();
	}

	public void adiciona(Funcionario funcionario){
		try{
			
			PreparedStatement stmt = connection.prepareStatement("insert into funcionarios(nome, usuario, senha) values(?,?,?)");
			
			stmt.setString(1, funcionario.getNome());
			stmt.setString(2, funcionario.getUsuario());
			stmt.setString(3, funcionario.getSenha());
			
			stmt.execute();
			stmt.close();
		}catch (SQLException sql) {
			throw new DAOException(sql);
		}
		
	}

}
