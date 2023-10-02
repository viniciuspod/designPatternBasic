package br.com.study.desingpattern.facthory;

import br.com.study.desingpattern.facthory.vehicles.Bicycle;
import br.com.study.desingpattern.facthory.vehicles.IVehicle;

public class BicycleTransport extends Transport{
    @Override
    protected IVehicle createTransport() {
        return new Bicycle();
    }
}
