package caelum.jdbc.teste;

import caelum.jdbc.dao.ContatoDAO;
import caelum.jdbc.modelo.Contato;

public class ContatoRemover {

	public static void main(String[] args) {
		
		long id = 4;
		
		ContatoDAO dao = new ContatoDAO();
		Contato contato = new Contato();
		contato.setId(id);
		
		dao.remove(contato);
	}

}
