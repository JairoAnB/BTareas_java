package org.example.bcj_comprobando_contrasena;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/evaluar-password")
public class EvaluarPassword extends HttpServlet {

    public void doPost (HttpServletRequest request, HttpServletResponse response)
            throws IOException, ServletException {
        response.setContentType("text/html");

        // Obtener parametro

        String password = request.getParameter("password");
        int contadorMayus = 0;
        int contadorNumeros = 0;

            for (int i = 0; i < password.length(); i++){
                char c = password.charAt(i);

                if (Character.isUpperCase(c)){
                    contadorMayus++;
                }
                if (Character.isDigit(c)){
                    contadorNumeros++;
                }
            }
            if (contadorMayus >= 4 && contadorNumeros >= 3){
                request.setAttribute("password", password);
                RequestDispatcher dispatcher = request.getRequestDispatcher("correcta.jsp");
                dispatcher.forward(request, response);
                return;
            }
            request.setAttribute("password", password);
            RequestDispatcher dispatcher = request.getRequestDispatcher("debil.jsp");
            dispatcher.forward(request, response);
    }
}
