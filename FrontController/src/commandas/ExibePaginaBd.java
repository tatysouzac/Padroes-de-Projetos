package commandas;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ExibePaginaBd implements Command{

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
	
	try {
		RequestDispatcher d = request.getRequestDispatcher("/bd.jsp");
		d.forward(request, response);
	} catch (ServletException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		
	}

}
