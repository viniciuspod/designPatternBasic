import br.com.study.bridge.platforms.*;
import br.com.study.bridge.transmission.Live;
import br.com.study.bridge.transmission.LiveAdvanced;
import br.com.study.bridge.transmission.LiveRecorded;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        startLive(new Youtube());
        startLive(new Twitch());
        startLive(new Facebook());
        startLive(new Disney());
    }

    public static void startLive(IPlatform platform){
//        System.out.println("iniciando a transmissao aguarde");
//        Live live = new Live(platform);
//        live.broadcasting();
//        live.result();

//        System.out.println("iniciando a transmissap avançada");
//        LiveAdvanced liveAdvanced = new LiveAdvanced(platform);
//        liveAdvanced.broadcasting();
//        liveAdvanced.comments();
//        liveAdvanced.subTitles();
//        liveAdvanced.result();

        System.out.println("iniciando transmissao gravada");
        LiveRecorded liveRecorded = new LiveRecorded(platform);
        liveRecorded.broadcasting();
        liveRecorded.record();
        liveRecorded.result();
    }
}