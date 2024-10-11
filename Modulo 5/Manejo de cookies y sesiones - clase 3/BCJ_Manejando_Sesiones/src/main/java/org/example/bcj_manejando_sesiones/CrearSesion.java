package org.example.bcj_manejando_sesiones;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/CrearSesion")
public class CrearSesion extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
        throws IOException {

        Producto miproducto = new Producto(1,"Iphone", 1000);

        HttpSession session = request.getSession();
        session.setAttribute("producto", miproducto);

        PrintWriter pw = response.getWriter();
        pw.println("<html><body> <H1>Producto instanciado correctamente, se mantiene en la sesion. </h1></body></html>");
    }
}
