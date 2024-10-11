package servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

@WebServlet("/procesaLogin")
public class ProcesaLogin extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        if("admin1".equals(username) && "admin1".equals(password) ){
            HttpSession session = request.getSession();
            session.setAttribute("username", username);
            response.sendRedirect("bienvenido.jsp");
        }else {
            response.sendRedirect("ErrorLogin.jsp");
        }


    }
}
