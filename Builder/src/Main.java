import br.com.study.builder.builders.CarBuilder;
import br.com.study.builder.builders.SportCarBuilder;
import br.com.study.builder.builders.TruckBuilder;
import br.com.study.builder.cars.Car;
import br.com.study.builder.cars.SportCar;
import br.com.study.builder.cars.Truck;
import br.com.study.builder.director.Director;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {


        Director director = new Director();

        CarBuilder builder = new CarBuilder();
        director.constructSedanCar(builder);

        Car car = builder.getResult();
        System.out.println(car.getCarType() + " produzido com sucesso");

        TruckBuilder truckBuilder = new TruckBuilder();
        director.constructTruck(truckBuilder);

        Truck truck = truckBuilder.getResult();
        System.out.println("caminhão: " + truck.result());

        SportCarBuilder sportCarBuilder = new SportCarBuilder();
        director.constructSportCar(sportCarBuilder);

        SportCar sportCar = sportCarBuilder.getResult();
        System.out.println("porsche: " + sportCar.result());
    }
}