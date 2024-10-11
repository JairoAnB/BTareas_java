package org.example.bcj_evaluacion_sesion;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/ProcesarDatos")
public class ProcesarDatos extends HttpServlet {
    protected void doPost (HttpServletRequest request, HttpServletResponse response)
        throws IOException {
        //variables
        int total = 0;
        double descuento = 0;
        double totalFinal = 0;
        //Recupero los datos del formulario
        String nombre = (String) request.getAttribute("nombre");
        String direccion = (String) request.getAttribute("direccion");
        int cantidad = (int) request.getAttribute("cantidadP1");
        int cantidad2 = (int) request.getAttribute("cantidadP2");
        int cantidad3 = (int) request.getAttribute("cantidadP3");
        int cantidad4 = (int) request.getAttribute("cantidadP4");


        //Añado valor a productos
        int tarjetaMadre = 249000;
        int ram = 45990;
        int procesador = 379000;
        int tarjetaVideo = 219900;


        //calculo precio unitario de cada producto
        int precioTarjetaMadre = tarjetaMadre * cantidad;
        int precioRam = ram * cantidad2;
        int precioProcesador = procesador * cantidad3;
        int precioTarjetaVideo = tarjetaVideo * cantidad4;


        //Calculo total
        total = precioTarjetaMadre + precioRam + precioProcesador + precioTarjetaVideo;
        //Calculo descuento
        descuento = total * 0.10;
        totalFinal = total - descuento;

        //guardo parametro
        request.setAttribute("precioTarjetaMadre", precioTarjetaMadre);
        request.setAttribute("precioRam", precioRam);
        request.setAttribute("precioProcesador", precioProcesador);
        request.setAttribute("precioTarjetaVideo", precioTarjetaVideo);
        request.setAttribute("total", total);
        request.setAttribute("totalFinal", totalFinal);

        try{
            request.getRequestDispatcher("Factura.jsp").forward(request, response);
        }catch (Exception e){
            throw new RuntimeException(e);
        }
    }
}
