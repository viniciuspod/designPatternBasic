package br.com.study.abstractfacthory.factories;

import br.com.study.abstractfacthory.aircrafts.Airplane;
import br.com.study.abstractfacthory.aircrafts.IAircraft;
import br.com.study.abstractfacthory.landvehicles.Car;
import br.com.study.abstractfacthory.landvehicles.ILandVehicle;

public class UberTransportFactory implements ITransportLandFactory,ITransportAirVehicle {
    @Override
    public ILandVehicle createTransportLandVehicle() {
        return new Car();
    }

    @Override
    public IAircraft createTransportAircraft() {
        return new Airplane();
    }
}
