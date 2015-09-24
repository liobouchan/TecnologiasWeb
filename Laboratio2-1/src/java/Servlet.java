import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * @author lio
 */
public class Servlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        response.setContentType("text/html;charset=UTF-8");
        String filas = request.getParameter("filas");
        String columnas = request.getParameter("columnas");
        HttpSession sesion = request.getSession();
        PrintWriter out = response.getWriter();
        int filasi = Integer.parseInt(filas);
        int columnasi = Integer.parseInt(columnas);
        
        sesion.setAttribute("filas", filas);
        sesion.setAttribute("columnas", filas);

        out.println("<html>");
        out.println("<head>");
        out.println("</head>");
        out.println("<body>");
        out.println("<form method='POST' action='Servlet2'>");
        for( int i=0; i<filasi; i++ ){
            for(int j=0; j<columnasi; j++){
                out.println("Dato "+i+j+" <input type='text' name='"+i+j+"'>");
            }
            out.println("<br>");
        }
        out.println("<input type='submit' />");
        out.println("</form>");
        out.println("</body>");
        out.println("</html>");
    }
}
