package apiservices;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import jakarta.ws.rs.client.Client;
import modelo.Joke;

import java.util.List;

public class ApiServices {
    private Client cliente;

    public ApiServices(){
        this.cliente = jakarta.ws.rs.client.ClientBuilder.newClient();
    }

    public Joke obtenerChiste() throws JsonProcessingException {
        jakarta.ws.rs.client.WebTarget target = cliente.target("https://official-joke-api.appspot.com/random_joke");
        String json = target.request().get(String.class);
        ObjectMapper mapper = new ObjectMapper();
        Joke chiste = mapper.readValue(json, Joke.class);
        return chiste;
    }

    public List<Joke> obtenerTenChistes()throws JsonProcessingException{
        jakarta.ws.rs.client.WebTarget target = cliente.target("https://official-joke-api.appspot.com/random_ten");
        String json = target.request().get(String.class);
        ObjectMapper mapper = new ObjectMapper();
        List<Joke> tenChiste = mapper.readValue(json, new TypeReference<List<Joke>>() {});
        return tenChiste;
    }

}
