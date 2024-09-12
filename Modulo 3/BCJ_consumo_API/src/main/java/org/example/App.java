package org.example;

import apiservices.ApiServices;
import modelo.Joke;
import java.util.List;
import java.util.Scanner;
public class App
{
    public static <webTarget> void main(String[] args ){

        ApiServices apiServices = new ApiServices();
        boolean salir = true;
        while (salir){
            Scanner sc = new Scanner(System.in);
            System.out.println("Welcome to practice program.\n" +
                    "Options:\n" +
                    "1.- One random joke\n" +
                    "2.- 10 random joke.\n" +
                    "3.- Exit");
            String opcion= sc.nextLine();
            switch (opcion){
                case "1":
                    try{
                        Joke joke = apiServices.obtenerChiste();
                        System.out.println(joke.getSetup());
                        System.out.println(joke.getPunchline());
                        System.out.println("----------------------");
                        break;
                    }catch (Exception e){
                        System.out.println("Error al leer el chiste: " + e.getMessage());
                    }
                case "2":
                    try{
                        List<Joke> jokes = apiServices.obtenerTenChistes();
                        for (Joke j : jokes) {
                            System.out.println(j.getSetup());
                            System.out.println(j.getPunchline());
                            System.out.println("----------------------");
                        }
                        break;
                    }catch (Exception e){
                        System.out.println("Error al leer el chiste: " + e.getMessage());
                    }
                case "3":
                    System.out.println("THANKS FOR USING THE PROGRAM. I HOPE YOU'RE DEAD FROM LAUGHTER!");
                    salir = false;
                    break;
            }
        }
    }
}
