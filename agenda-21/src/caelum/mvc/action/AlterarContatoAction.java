package caelum.mvc.action;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import caelum.jdbc.dao.ContatoDAO;
import caelum.jdbc.modelo.Contato;

public class AlterarContatoAction implements IAction{

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response)
			throws Exception {

		Contato contato = new Contato();
		long id = Long.parseLong(request.getParameter("id"));
		contato.setId(id);
		contato.setNome(request.getParameter("nome"));
		contato.setEmail(request.getParameter("email"));
		contato.setEndereco(request.getParameter("endereco"));
		
		//treta da data
		
		String dataEmtext = request.getParameter("dataNascimento");
		Date date = new SimpleDateFormat("dd/mm/yyyy").parse(dataEmtext);
		Calendar dataNascimento = Calendar.getInstance();
		dataNascimento.setTime(date);
		
		contato.setDataNascimento(dataNascimento);
		
		ContatoDAO dao = new ContatoDAO();
		dao.altera(contato);
		
		RequestDispatcher rd = request.getRequestDispatcher("/contatos.jsp");
		rd.forward(request, response);
		System.out.println("Alterando contato..." + contato.getNome());
	}
}
