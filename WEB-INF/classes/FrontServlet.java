package etu2069.framework.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletConfig;

public class FrontServlet extends HttpServlet{
    public void processRequest(HttpServletRequest request, HttpServletResponse response)throws IOException, ServletException {
        String nom = "bonjour";
        // mandefa attribut any aminy jsp tsy maintsy mitovy anarana amile variable 
        request.setAttribute("nom",nom);
        request.getRequestDispatcher("temp.jsp").forward(request,response);
        // response.sendRedirect("index.jsp"); 
    }
    public void doPost(HttpServletRequest request, HttpServletResponse response)throws IOException, ServletException {
        processRequest(request, response);
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response)throws IOException, ServletException {
        processRequest(request, response);
    }
}
