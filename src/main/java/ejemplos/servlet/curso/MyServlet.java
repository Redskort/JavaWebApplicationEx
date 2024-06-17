package ejemplos.servlet.curso;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = "/myServlet")
public class MyServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		// send HTML page to client
		out.println("<html>");
		out.println("<head><title>Servlet1 Form</title></head>");
		out.println("<body>");
		out.println("<h1 style='margin-left:35px; color:green;'>Indicanos tus datos</h1>");
		out.println("<form action=\"/myServlet2\" method=\"GET\">");
		out.println("<ul style='list-style:none'><li><label for='name'>Nombre:</label><br>");
		out.println("<input type='text' id='name' name='nombre' autocomplete='off'></li><br><br>");
		out.println("<li><label for='mail'>Email:</label><br>");
		out.println("<input type='text' id='mail' name='mail' autocomplete='off'></li><br><br>");
		out.println("<button type='submit' style='color:red; width:80px; height:80px; border-radius:50%;'>Enviar</button>");
		out.println("</form></body></html>");
	}

}