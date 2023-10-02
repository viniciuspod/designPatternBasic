package br.com.study.chainofresponsability.server;

import br.com.study.chainofresponsability.middlewares.Middleware;

import java.util.HashMap;
import java.util.Map;

public class Server {

    private Map<String, String> users = new HashMap<>();
    private Middleware middlware;

    public void setMiddlware(Middleware middlware) {
        this.middlware = middlware;
    }

    public boolean logIn(String email, String password){
        if(middlware.check(email,password)){
            System.out.println("Usuario autorizado");
            System.out.println("Bem vindo");
            return true;
        }
        return false;
    }

    public void registerUser(String email, String password){
        users.put(email,password);
    }

    public boolean hasEmail(String email){
        return users.containsKey(email);
    }

    public boolean isValidPassword(String email, String password){
        return users.get(email).equals(password);
    }
}
