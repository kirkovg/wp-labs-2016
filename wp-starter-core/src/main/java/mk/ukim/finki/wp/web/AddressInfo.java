package mk.ukim.finki.wp.web;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by Win 8 on 20.11.2016.
 */
@WebServlet(name = "AddressInfo")
public class AddressInfo extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String pizzaSize = (String) request.getSession().getAttribute("golemina");
        String name = request.getParameter("name");
        String address = request.getParameter("address");
        response.setContentType("text/html");
        PrintWriter writer = null;


        try {
            writer = response.getWriter();
            writer.print("<h3>" + request.getHeader("User-Agent") + "</h3>");
            writer.print("<h3>" + pizzaSize + "</h3>");
            writer.print("<h3>" + name + "</h3>");
            writer.print("<h3>" + address + "</h3>");

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (writer != null) {
                writer.close();
            }
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
