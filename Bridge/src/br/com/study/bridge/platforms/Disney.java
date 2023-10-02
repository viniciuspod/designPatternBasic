package br.com.study.bridge.platforms;

public class Disney implements IPlatform{
    public Disney(){
        configureRMTP();
        System.out.println("Disney: Transmissao Iniciada");
    }
    @Override
    public void configureRMTP() {
        authToken();
        System.out.println("Disney: conta autorizada");
    }

    @Override
    public void authToken() {
        System.out.println("Disney: Autorizando aplicacao");
    }
}
