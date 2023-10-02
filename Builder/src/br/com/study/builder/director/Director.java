package br.com.study.builder.director;

import br.com.study.builder.builders.IBuilder;
import br.com.study.builder.builders.IBuilderSportCar;
import br.com.study.builder.builders.IBuilderTruck;
import br.com.study.builder.components.CarType;
import br.com.study.builder.components.Engine;
import br.com.study.builder.components.Horse;
import br.com.study.builder.components.Transmission;

public class Director {

    public void constructSedanCar(IBuilder builder){
        builder.setCarType(CarType.SEDAN);
        builder.setSeats(5);
        builder.setTransmission(Transmission.AUTOMATIC);
        builder.setEngine(new Engine(1600));
    }
    public void constructTruck(IBuilderTruck builder){
        builder.setCarType(CarType.TRUCK);
        builder.setSeats(2);
        builder.setTransmission(Transmission.AUTOMATIC_SEQUENTIAL);
        builder.setEngine(new Engine(3000));
        builder.setHorse(new Horse(3));
    }

    public void constructSportCar(IBuilderSportCar builder){
        builder.setCarType(CarType.SPORTCAR);
        builder.setSeats(2);
        builder.setTransmission(Transmission.AUTOMATIC);
        builder.setEngine(new Engine(4000));
        builder.setColor("Amarelo");
    }
}
