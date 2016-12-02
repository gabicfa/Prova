import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/servletControl.do")
public class ServletControl extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public ServletControl(){
		super();
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		process(request,response);
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		process(request,response);
	}
	
	private void process(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		Usuario usuario = new Usuario();
		
		usuario.setNome((String)request.getParameter("nome"));

		int simbolo1 = usuario.getSimbolo1();
		int simbolo2 = usuario.getSimbolo2();
		int simbolo3 = usuario.getSimbolo3();
		int moeda;
		
		if (simbolo1 == simbolo2 && simbolo1 == simbolo2){
			moeda = usuario.getMoeda() + 10;
			usuario.setMoeda(moeda);
		}
		else{
			moeda = usuario.getMoeda() - 1;
			usuario.setMoeda(moeda);
		}
		
		
		request.setAttribute("moeda", moeda);
		request.setAttribute("simbolo1", simbolo1);
		request.setAttribute("simbolo2", simbolo2);
		request.setAttribute("simbolo3", simbolo3);
		request.setAttribute("nome", usuario.getNome());
		request.getRequestDispatcher("resultado.jsp").forward(request, response);
	}
}
