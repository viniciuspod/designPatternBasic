package br.com.study.chainofresponsability.middlewares;

public class CheckPermissionMiddleware extends Middleware{
    @Override
    public boolean check(String email, String password) {
        if(email.equals("master@study.com.br")){
            System.out.println("bem Vindo administrado");
            return true;
        }
        System.out.println("Bem Vindo!");
        return checkNext(email, password);
    }
}
