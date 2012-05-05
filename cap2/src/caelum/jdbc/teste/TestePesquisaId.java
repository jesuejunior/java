package caelum.jdbc.teste;

import java.sql.SQLException;
import java.text.DateFormat;

import caelum.jdbc.dao.ContatoDAO;
import caelum.jdbc.modelo.Contato;

public class TestePesquisaId {

	public static void main(String[] args) throws SQLException {


		ContatoDAO dao = new ContatoDAO();

		Contato contato = dao.pesquisaPorId(3);
		
		System.out.println("Nome: " + contato.getNome());
		System.out.println("Email: " + contato.getEmail());
		System.out.println("Endereço: " + contato.getEndereco());
		System.out.println("Data de Nascimento: "
				+ DateFormat.getDateInstance().format(contato.getDataNascimento().getTime()) + "\n");
	}

}
