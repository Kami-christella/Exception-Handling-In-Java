import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ErrorHandling  extends HttpServlet {
	
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
		
		PrintWriter out = res.getWriter();
		
		Throwable throwable = (Throwable)req.getAttribute("javax.servlet.error.exception");
		
		Integer status = (Integer)req.getAttribute("javax.servlet.error.status_code");
		
		String servlet_name = (String)req.getAttribute("javax.servlet.error.servlet_name");
		
		if(servlet_name == null ) {
			servlet_name = "Unknow";
		}
		res.setContentType("text/html");
		if(status == 404) {
			out.println("<html><body>");
			out.println("<p>The resource you are looking is not available</p>");
			out.println("</body></html>");
		}else if(status == 405) {
			out.println("<html><body>");
			out.println("<p>Please double check the method you are sending</p>");
			out.println("</body></html>");
		}else {
			out.println("<html><body>");
			out.println("<p>Please, try again letter</p>");
			out.println("</body></html>");
		}
		
	}

	
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException {
		doGet(req,res);
	}
}
