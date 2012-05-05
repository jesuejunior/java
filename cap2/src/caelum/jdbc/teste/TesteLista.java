package caelum.jdbc.teste;

import java.sql.SQLException;
import java.text.DateFormat;
import java.util.List;

import caelum.jdbc.dao.ContatoDAO;
import caelum.jdbc.modelo.Contato;

public class TesteLista {

	public static void main(String[] args) {

		String nome = "Fernanda";
		
		ContatoDAO dao = new ContatoDAO();
		
		List<Contato> contatos;
		try {
			contatos = dao.getContatoNome(nome);

			for (Contato contato : contatos) {
				System.out.println("Nome: " + contato.getNome());
				System.out.println("Email: " + contato.getEmail());
				System.out.println("Endereço: " + contato.getEndereco());
				System.out.println("Data de Nascimento: " + DateFormat.getDateInstance().format(contato.getDataNascimento().getTime()) + "\n");
			}
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
		

		
	}

}

