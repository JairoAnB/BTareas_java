package org.example.bcj_manejando_sesiones;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

@WebServlet("/VerSesion")
public class VerSesion extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
        throws IOException {

        HttpSession session = request.getSession();
        Producto miproducto = (Producto) session.getAttribute("producto");

        response.getWriter().println("<html><body>Id: "+ miproducto.getId() + "</body></html>");
        response.getWriter().println("<html><body></br></body></html>");
        response.getWriter().println("<html><body>Concepto: " + miproducto.getConcepto() + "</body></html>");
        response.getWriter().println("<html><body></br></body></html>");
        response.getWriter().println("<html><body>Importe: " + miproducto.getImporte() + "</body></html>");
        response.getWriter().println("<html><body></br></body></html>");
        response.getWriter().println("<html><body>Datos del objeto, producto generado manualmente en servlet CrearSession</body></html>");
        response.getWriter().println("<html><body></br></body></html>");

    }
}
