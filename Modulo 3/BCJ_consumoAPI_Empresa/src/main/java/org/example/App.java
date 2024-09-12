package org.example;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import controlador.Controler;
import jakarta.ws.rs.client.Client;
import jakarta.ws.rs.client.ClientBuilder;
import jakarta.ws.rs.client.WebTarget;
import jakarta.ws.rs.core.Response;
import modelo.Datos;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws JsonProcessingException {

        Controler c = new Controler();

        Client cliente = ClientBuilder.newClient();
        WebTarget target = cliente.target("https://api.ipbase.com/v2/info?apikey=ipb_live_I6oVeB8Y2yv1t6L8fEEcUg51cBOtT0NK3LNwblhV&ip=2800:300:6f14:3de0:8170:fe3f:2042:fb4b");
        Response respuesta = target.request().get();
        String json = respuesta.readEntity(String.class);

        ObjectMapper mapper = new ObjectMapper();
        Datos datos = mapper.readValue(json, Datos.class);
            System.out.println("Bienvenido!");
            System.out.println("Para crear un usuario debe llenar los siguientes campos:");
            Scanner sc = new Scanner(System.in);
            String nombre;
        do {
            System.out.print("Nombre: ");
            nombre = sc.nextLine();
            c.validacionNombre(nombre);
        }while (nombre.isEmpty());
        String apellido;
        do {
            System.out.print("Apellido: ");
            apellido = sc.nextLine();
            c.valicacionApellido(apellido);
        }while (apellido.isEmpty());
        String correo;
        do {
            System.out.print("Correo: ");
            correo = sc.nextLine();
            c.validacionCorreo(correo);
        }while (!correo.contains("@"));
        String contrasena;
        do {
            System.out.print("Contraseña: ");
            contrasena = sc.nextLine();
            c.validacionContrasena(contrasena);
        }while (contrasena.length() < 8);

        System.out.println("-----------------------------------");
            System.out.println("Gracias por registrarse, su usuario es:\n" +
                    "Nomnbre: " + nombre + "\n" +
                    "Apellido: " + apellido + "\n" +
                    "Correo: " + correo + "\n" +
                    "Contraseña: " + contrasena + "\n" +
                    "Ciudad: " + datos.getData().getLocation().getCity().getName() + "\n" +
                    "Region: " + datos.getData().getLocation().getRegion().getName() + "\n" +
                    "Pais: " + datos.getData().getLocation().getCountry().getName() + "\n" +
                    "Continente: " + datos.getData().getLocation().getContinent().getName());
    }
}