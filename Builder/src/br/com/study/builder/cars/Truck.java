package br.com.study.builder.cars;

import br.com.study.builder.components.CarType;
import br.com.study.builder.components.Engine;
import br.com.study.builder.components.Horse;
import br.com.study.builder.components.Transmission;

public class Truck {
    private final CarType carType;
    private final int seats;
    private final Engine engine;
    private final Transmission transmission;
    private final Horse horse;

    public Truck(CarType carType,
               int seats,
               Engine engine,
               Transmission transmission,
               Horse horse){
        this.carType = carType;
        this.seats = seats;
        this.engine = engine;
        this.transmission = transmission;
        this.horse = horse;
    }

    public String result(){
        String truck = "Truck with motor: " + engine.getPower() + "\n";
        truck += " Transmission: " + transmission + " Cavalo engatado com " + horse.getCarretas() + " carretas";

        return truck;
    }
}
