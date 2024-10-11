package org.example.bcj_evaluacion_sesion;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/RecibirDatos")
public class RecibirDatos extends HttpServlet {
    protected void doPost (HttpServletRequest request, HttpServletResponse response)
        throws IOException {
        //Recupero los datos del formulario.
        String nombre = request.getParameter("nombre");
        String direccion = request.getParameter("direccion");
        int cantidad = Integer.parseInt(request.getParameter("cantidadP1"));
        int cantidad2 = Integer.parseInt(request.getParameter("cantidadP2"));
        int cantidad3 = Integer.parseInt(request.getParameter("cantidadP3"));
        int cantidad4 = Integer.parseInt(request.getParameter("cantidadP4"));

        request.setAttribute("nombre", nombre);
        request.setAttribute("direccion", direccion);
        request.setAttribute("cantidadP1", cantidad);
        request.setAttribute("cantidadP2", cantidad2);
        request.setAttribute("cantidadP3", cantidad3);
        request.setAttribute("cantidadP4", cantidad4);

        try{
            request.getRequestDispatcher("ProcesarDatos").forward(request, response);
        } catch (ServletException e) {
            throw new RuntimeException(e);
        }
    }

}
