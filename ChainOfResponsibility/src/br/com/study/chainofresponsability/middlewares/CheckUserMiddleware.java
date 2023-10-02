package br.com.study.chainofresponsability.middlewares;

import br.com.study.chainofresponsability.server.Server;

public class CheckUserMiddleware extends Middleware{
    private Server server;

    public CheckUserMiddleware(Server server){
        this.server = server;
    }

    @Override
    public boolean check(String email, String password) {
        if(!server.hasEmail(email)){
            System.out.println("email invalido");
            return false;
        }

        if(!server.isValidPassword(email, password)){
            System.out.println("E-mail ou Senha invalidos");
            return false;
        }
        return checkNext(email, password);
    }
}
