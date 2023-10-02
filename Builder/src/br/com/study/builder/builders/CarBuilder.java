package br.com.study.builder.builders;

import br.com.study.builder.cars.Car;
import br.com.study.builder.components.CarType;
import br.com.study.builder.components.Engine;
import br.com.study.builder.components.Transmission;

public class CarBuilder implements IBuilder{

    private CarType carType;
    private int seats;
    private Transmission transmission;
    private Engine engine;

    @Override
    public void setCarType(CarType cartype) {
        this.carType = cartype;
    }

    @Override
    public void setSeats(int seats) {
        this.seats = seats;
    }

    @Override
    public void setTransmission(Transmission transmission) {
        this.transmission = transmission;
    }

    @Override
    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public Car getResult(){
        return new Car(carType,seats,engine,transmission);
    }
}
