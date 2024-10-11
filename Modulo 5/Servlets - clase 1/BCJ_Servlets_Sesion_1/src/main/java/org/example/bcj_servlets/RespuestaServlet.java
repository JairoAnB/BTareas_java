package org.example.bcj_servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/Respuesta")
public class RespuestaServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String nombre = request.getParameter("nombre");
        response.setContentType("text/html");
        try(PrintWriter out = response.getWriter()){
            out.println("<html><body>");
            out.println("<h1>Nombre Ingresado: " + nombre + "</h1>");
            out.println("</body></html>");
        }
    }
}
