package caelum.jdbc.teste;

import java.sql.Connection;
import java.sql.SQLException;

import caelum.jdbc.ConnectionFactory;

public class ContatoConexao {
	public static void main(String[] args) throws SQLException {
		Connection connection = new ConnectionFactory().getConnection();
		System.out.println("Conexão aberta!");
		connection.close();
	}

}
