import br.com.study.abstractfacthory.app.Application;
import br.com.study.abstractfacthory.factories.*;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {

    public static Application configureApplication(String company){
        Application app;
        ITransportLandFactory factoryLand = null;
        ITransportAirVehicle factoryAir = null;
        ITransportSeaFactory factorySea = null;

        if ("uber".equals(company)) {
            factoryLand = new UberTransportFactory();
            factoryAir = new UberTransportFactory();
            app = new Application(factoryLand,factoryAir);
        } else if ("NineNine".equals(company)) {
            factoryLand = new NineNineTransportFactory();
            factoryAir = new NineNineTransportFactory();
            app = new Application(factoryLand,factoryAir);
        } else if ("Boat".equals(company)) {
            factorySea = new BoatTransportFactory();
            app = new Application(factorySea);
        } else {
            throw new IllegalArgumentException("Empresa desconhecida: " + company);
        }

        return app;
    }

    public static void main(String[] args) {
        String company = "Boat";
        Application app = configureApplication(company);
        app.startRoute();
    }
}