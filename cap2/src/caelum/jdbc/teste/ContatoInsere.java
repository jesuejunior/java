package caelum.jdbc.teste;

import java.util.Calendar;

import caelum.jdbc.dao.ContatoDAO;
import caelum.jdbc.modelo.Contato;

public class ContatoInsere {

	public static void main(String[] args) {
		
		Contato contato = new Contato();
		contato.setNome("Fernanda");
		contato.setEmail("fernanda@gmail.com");
		contato.setEndereco("Rua social, 13");
		contato.setDataNascimento(Calendar.getInstance());

		Contato contato1 = new Contato();
		contato1.setNome("Thais");
		contato1.setEmail("thais@hotmail.com");
		contato1.setEndereco("Av. conselheiro, 13");
		contato1.setDataNascimento(Calendar.getInstance());

		Contato contato2 = new Contato();
		contato2.setNome("Suzana");
		contato2.setEmail("suzana123@yahoo.com.br");
		contato2.setEndereco("Av. conselheiro, 13");
		contato2.setDataNascimento(Calendar.getInstance());
		
		ContatoDAO dao = new ContatoDAO();
		
		dao.adiciona(contato);
		dao.adiciona(contato1);
		
		System.out.println("Gravado com sucesso");
	}

}
