import br.com.study.chainofresponsability.middlewares.CheckPermissionMiddleware;
import br.com.study.chainofresponsability.middlewares.CheckUserMiddleware;
import br.com.study.chainofresponsability.middlewares.Middleware;
import br.com.study.chainofresponsability.server.Server;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {

    private static final BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    private static Server server;

    public static void init(){
        server = new Server();
        server.registerUser("master@study.com.br","45632");
        server.registerUser("user@study.com.br","12345");

        Middleware middleware = new CheckUserMiddleware(server);
        middleware.linkWith(new CheckPermissionMiddleware());

        server.setMiddlware(middleware);
    }
    public static void main(String[] args) throws IOException {
        init();

        boolean done;

        do{
            System.out.println("digite o email: ");
            String email = reader.readLine();
            System.out.println("digite a sua senha: ");
            String password = reader.readLine();
            done = server.logIn(email,password);
        }while(!done);
    }
}