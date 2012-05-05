package caelum.jdbc.teste;

import java.text.DateFormat;
import java.util.Calendar;

import caelum.jdbc.dao.ContatoDAO;
import caelum.jdbc.modelo.Contato;

public class ContatoAlterar {

	public static void main(String[] args) {
		
		long id = 1;
		Calendar data = Calendar.getInstance();
		data.set(1980, 05, 12);
		
		ContatoDAO dao = new ContatoDAO();
		
		Contato contato = new Contato();
		
		contato.setNome("Mariana");
		contato.setEmail("marianinha@sex.com");
		contato.setEndereco("Travessa da 51, 88");
		contato.setDataNascimento(data);
		contato.setId(id);
		
		dao.altera(contato);
		
	}

}
