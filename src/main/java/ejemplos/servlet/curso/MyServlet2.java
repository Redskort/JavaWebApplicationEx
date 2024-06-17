package ejemplos.servlet.curso;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = "/myServlet2")
public class MyServlet2 extends HttpServlet {

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
	    String nombre = request.getParameter("nombre");
		String mail = request.getParameter("mail");

		// send HTML page to client
		out.println("<html>");
		out.println("<head><title>Servlet2</title></head>");
		out.println("<body>");
		out.print("<h1>Bienvenido " + nombre + " !!!</h1>");
		out.print("<br><p> Te enviaremos toda la informacion a " + mail +"</p>");
	}

}