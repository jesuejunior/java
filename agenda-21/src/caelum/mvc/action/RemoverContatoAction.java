package caelum.mvc.action;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import caelum.jdbc.dao.ContatoDAO;
import caelum.jdbc.modelo.Contato;

public class RemoverContatoAction implements IAction {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response)throws Exception {

		Contato contato = new Contato();
		long id = Long.parseLong(request.getParameter("id"));
		contato.setId(id);
		
		ContatoDAO dao = new ContatoDAO();
		System.out.println("Contato " + contato.getNome() + "removido");
		dao.remove(contato);
		
		
		RequestDispatcher rd = request.getRequestDispatcher("/index.jsp");
		rd.forward(request, response);
		
	}

}
