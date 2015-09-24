import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author lio
 */
public class Servlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html;charset=UTF-8");
        String filas = request.getParameter("filas");
        String columnas = request.getParameter("columnas");
        int filasi = Integer.parseInt(filas);
        int columnasi = Integer.parseInt(columnas);
        PrintWriter out = response.getWriter();
        
        out.println("<html>");
        out.println("<head>");
        out.println("</head>");
        out.println("<body>");
        out.println("<table border='1'>");
        
        for( int i=0; i<filasi; i++ ){
            out.println("<tr>");
            for(int j=0; j<columnasi; j++){
                out.println("<td>dato</td>");
            }
            out.println("</tr>");
        }
        
        out.println("</table>");
        out.println("</body>");
        out.println("</html>");
        
    }

}
