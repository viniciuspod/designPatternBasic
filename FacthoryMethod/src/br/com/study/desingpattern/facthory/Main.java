package br.com.study.desingpattern.facthory;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {

    private static  Transport transport;

    public static void main(String[] args) {
        configure(args[0]);
        if(transport != null){
            runTransport();
        }
    }

    private static void runTransport() {
        transport.startTransport();
    }

    private static void configure(String type) {
        switch(type){
            case "uber":
                transport = new CarTransport();
                break;
            case "log":
                transport = new MothorcycleTransport();
                break;
            case "eats":
                transport = new BicycleTransport();
                break;
            default:
                System.out.println("selecione o tipo de entrega");
        }
    }
}