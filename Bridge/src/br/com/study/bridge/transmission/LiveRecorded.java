package br.com.study.bridge.transmission;

import br.com.study.bridge.platforms.IPlatform;

public class LiveRecorded extends Live{

    public LiveRecorded(IPlatform platform){
        super.platform = platform;
    }

    public void record(){
        System.out.println("começando a grvação da live");
    }
}
