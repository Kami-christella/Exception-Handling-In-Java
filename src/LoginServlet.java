import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginServlet extends HttpServlet{

	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
		String userName = req.getParameter("userName");
		String password = req.getParameter("password");
		
		int divion = Integer.parseInt(userName)/Integer.parseInt(password);
		PrintWriter out = res.getWriter();
		
		res.setContentType("text/html");
		out.println("<html><body>");
		out.println("<h1>Hello error handling </h1>");
		out.println("</body></html>");
		
		
	}
}
