package br.com.study.bridge.platforms;

public class Facebook implements IPlatform{

    public Facebook(){
        configureRMTP();
        System.out.println("Facebook: Transmissao Iniciada");
    }
    @Override
    public void configureRMTP() {
        authToken();
        System.out.println("Facebook: conta autorizada");
    }

    @Override
    public void authToken() {
        System.out.println("Facebook: Autorizando aplicacao");
    }
}
