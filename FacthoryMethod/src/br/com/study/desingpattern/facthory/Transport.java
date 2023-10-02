package br.com.study.desingpattern.facthory;

import br.com.study.desingpattern.facthory.vehicles.IVehicle;

public abstract class Transport {

    void startTransport(){
        IVehicle vehicle = createTransport();
        vehicle.startRoute();
    }

    protected abstract IVehicle createTransport();
}
