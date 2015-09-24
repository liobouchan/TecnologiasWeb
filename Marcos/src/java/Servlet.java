/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

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
protected void doGet(HttpServletRequest request , HttpServletResponse response)
throws ServletException, IOException{
    response.setContentType("text/html;charset=UTF-8");
    PrintWriter out = response.getWriter();
    out.print("<html>");
    out.print("<head>");
    out.print("</head>");
    out.print("<frameset cols='80,*' frameborder='yes' border='1' framespacing='0'>");
    out.print("<frame src='index.html' name='leftFrame' scrolling='no' noresize='noresize' id='leftFrame'>");
    out.print("<frame src='Servlet2' name='leftFrame' scrolling='no' noresize='noresize' id='leftFrame'>");
    out.print("</frameset>");
    out.print("<noframes>");
    out.print("<body>");
    out.print("</body>");
    out.print("</html>");

}
}