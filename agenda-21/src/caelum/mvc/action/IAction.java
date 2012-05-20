package caelum.mvc.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface IAction{
	void execute(HttpServletRequest request, HttpServletResponse response) throws Exception;
}
