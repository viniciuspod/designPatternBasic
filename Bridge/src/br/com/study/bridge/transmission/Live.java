package br.com.study.bridge.transmission;

import br.com.study.bridge.platforms.IPlatform;

public class Live implements ITransmission{
    protected IPlatform platform;

    public Live(){}

    public Live(IPlatform platform){
        this.platform = platform;
    }
    @Override
    public void broadcasting() {
        System.out.println("Iniciando a transmissao");
    }

    @Override
    public void result() {
        System.out.println("**** ON AIR*****");
    }
}
