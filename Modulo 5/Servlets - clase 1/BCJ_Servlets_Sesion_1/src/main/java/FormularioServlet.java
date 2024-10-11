import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/Formulario")
public class FormularioServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
        throws IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1>Formulario</h1>");
        out.println("<h1>Ingrese su nombre</h1>");
        out.println("<form action='Respuesta' method='get'>");
        out.println("<input type='text' name='nombre'/>");
        out.println("<input type='submit' value='Enviar'/>");
        out.println("</form>");
        out.println("</body></html>");
        }
    }
