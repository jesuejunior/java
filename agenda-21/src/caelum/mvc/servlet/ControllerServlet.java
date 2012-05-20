package caelum.mvc.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import caelum.mvc.action.IAction;

public class ControllerServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	String param = request.getParameter("action");
	String className = "caelum.mvc.action." + param;
	
	try{
		Class classe = Class.forName(className);
		
		IAction action = (IAction) classe.newInstance();
		action.execute(request, response);
	}catch (Exception e) {
		throw new ServletException("Ocorreu um problema na execução da Action", e);
	}
	
	
	}
	
}
