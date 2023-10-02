package br.com.study.bridge.transmission;

import br.com.study.bridge.platforms.IPlatform;

public class LiveAdvanced extends Live{
    public LiveAdvanced(IPlatform platform) {
        super.platform = platform;
    }

    public void subTitles(){
        System.out.println("legendas ativadas na trasmissão");
    }

    public void comments(){
        System.out.println("comentarios liberados");
    }
}
