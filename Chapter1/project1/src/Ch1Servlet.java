import jakarta.servlet.*;
import jakarta.servlet.http.*;
import java.io.*;

public class Ch1Servlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		PrintWriter out = response.getWriter();
		java.util.Date today = new java.util.Date();
		out.println("<html>" + "<body>" + "<h1 align=center>HF\'s Chapter 1 Servlet</h1>" + "<br>" + today + "</body>" + "</html>");
	}
}
