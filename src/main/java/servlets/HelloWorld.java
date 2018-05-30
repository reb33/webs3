package servlets;

import javax.servlet.Servlet;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class HelloWorld extends HttpServlet implements Servlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        try
        {
            resp.setContentType("text/html");
            PrintWriter printWriter = resp.getWriter();
            printWriter.println("<h2>");
            printWriter.println("Hello World");
            printWriter.println("</h2>");
            }
        catch (IOException ioException)
        {
            ioException.printStackTrace();
        }
    }
}
