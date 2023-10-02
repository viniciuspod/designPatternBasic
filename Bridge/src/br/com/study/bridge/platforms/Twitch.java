package br.com.study.bridge.platforms;

public class Twitch implements IPlatform{
    public Twitch(){
        configureRMTP();
        System.out.println("Twitch: Transmissao Iniciada");
    }
    @Override
    public void configureRMTP() {
        authToken();
        System.out.println("Twitch: conta autorizada");
    }

    @Override
    public void authToken() {
        System.out.println("Twitch: Autorizando aplicacao");
    }
}
