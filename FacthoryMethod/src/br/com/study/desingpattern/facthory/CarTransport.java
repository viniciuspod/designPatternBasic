package br.com.study.desingpattern.facthory;

import br.com.study.desingpattern.facthory.vehicles.Car;
import br.com.study.desingpattern.facthory.vehicles.IVehicle;

public class CarTransport extends Transport{
    @Override
    protected IVehicle createTransport() {
        return new Car();
    }
}
