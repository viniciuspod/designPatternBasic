package br.com.study.builder.builders;

import br.com.study.builder.cars.Truck;
import br.com.study.builder.components.CarType;
import br.com.study.builder.components.Engine;
import br.com.study.builder.components.Horse;
import br.com.study.builder.components.Transmission;

public class TruckBuilder implements IBuilderTruck{

    private CarType carType;
    private int seats;
    private Transmission transmission;
    private Engine engine;
    private Horse horse;
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

    @Override
    public void setHorse(Horse horse) {
        this.horse = horse;
    }

    public Truck getResult(){
        return new Truck(carType,seats,engine,transmission,horse);
    }


}
