package br.com.study.builder.cars;

import br.com.study.builder.components.CarType;
import br.com.study.builder.components.Engine;
import br.com.study.builder.components.Transmission;

public class SportCar {

    private final CarType carType;
    private final int seats;
    private final Engine engine;
    private final Transmission transmission;
    private final String color;

    public SportCar(CarType carType,
               int seats,
               Engine engine,
               Transmission transmission,
               String color){
        this.carType = carType;
        this.seats = seats;
        this.engine = engine;
        this.transmission = transmission;
        this.color = color;
    }

    public CarType getCarType() {
        return carType;
    }

    public int getSeats() {
        return seats;
    }

    public Engine getEngine() {
        return engine;
    }

    public Transmission getTransmission() {
        return transmission;
    }

    public String getColor() {
        return color;
    }

    public String result(){
        String sportCar = "SportCar with motor: " + engine.getPower() + "\n";
        sportCar += "color: " + color;
        return sportCar;
    }
}
