package caelum.mvc.action;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class FirstAction implements IAction{

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response)throws Exception {
		
		System.out.println("Redirect -->>");
		
		RequestDispatcher rd = request.getRequestDispatcher("/contatos.jsp");
		rd.forward(request, response);
		
	}

}
