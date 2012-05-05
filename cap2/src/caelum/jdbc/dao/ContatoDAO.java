package caelum.jdbc.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import caelum.jdbc.ConnectionFactory;
import caelum.jdbc.exception.DAOException;
import caelum.jdbc.modelo.Contato;

public class ContatoDAO {

	private Connection connection;

	public ContatoDAO() {
		this.connection = new ConnectionFactory().getConnection();
	}

	public void adiciona(Contato contato) {
		String sql = "insert into contatos (nome,email,endereco,dataNascimento) values(?,?,?,?)";

		try {

			PreparedStatement stmt = connection.prepareStatement(sql);

			stmt.setString(1, contato.getNome());
			stmt.setString(2, contato.getEmail());
			stmt.setString(3, contato.getEndereco());
			stmt.setDate(4, new Date(contato.getDataNascimento()
					.getTimeInMillis()));

			stmt.execute();
			stmt.close();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

	public List<Contato> getLista() throws SQLException {
		try{
			
		List<Contato> contatos = new ArrayList<Contato>();
		PreparedStatement stmt = this.connection.prepareStatement("select * from contatos");
		ResultSet rs = stmt.executeQuery();
		
		
		while(rs.next()){
			Contato contato = new Contato();
			contato.setNome(rs.getString("nome"));
			contato.setEmail(rs.getString("email"));
			contato.setEndereco(rs.getString("endereco"));

			Calendar data = Calendar.getInstance();
			data.setTime(rs.getDate("dataNascimento"));
			contato.setDataNascimento(data);

			contatos.add(contato);
			
		}
		rs.close();
		stmt.close();
		
		return contatos;
	} catch (SQLException e) {
		throw new DAOException(e);
	}
	}



public List<Contato> getContatoNome(String nome) throws SQLException {
	try{
		
		List<Contato> contatos = new ArrayList<Contato>();
		PreparedStatement stmt = this.connection.prepareStatement("select * from contatos where nome  like '" + nome  + "%'");
		ResultSet rs = stmt.executeQuery();
		
		
		while(rs.next()){
			Contato contato = new Contato();
			contato.setNome(rs.getString("nome"));
			contato.setEmail(rs.getString("email"));
			contato.setEndereco(rs.getString("endereco"));
			
			Calendar data = Calendar.getInstance();
			data.setTime(rs.getDate("dataNascimento"));
			contato.setDataNascimento(data);
			
			contatos.add(contato);
			
		}
		rs.close();
		stmt.close();
		
		return contatos;
	} catch (SQLException e) {
		throw new DAOException(e);
	}
}

public Contato pesquisaPorId(Integer id){
	try{
		PreparedStatement stmt = this.connection.prepareStatement("select * from contatos where id = " + id);
		ResultSet rs = stmt.executeQuery();
		
		rs.next();
		Contato contato = new Contato();
		contato.setNome(rs.getString("nome"));
		contato.setEmail(rs.getString("email"));
		contato.setEndereco(rs.getString("endereco"));
		
		Calendar data = Calendar.getInstance();
		data.setTime(rs.getDate("dataNascimento"));
		contato.setDataNascimento(data);
		
		rs.close();
		stmt.close();
	
		return contato;
	}catch (SQLException sql){
		throw new DAOException(sql);
	}
}

}



