package br.com.study.abstractfacthory.factories;

import br.com.study.abstractfacthory.aircrafts.Helicopter;
import br.com.study.abstractfacthory.aircrafts.IAircraft;
import br.com.study.abstractfacthory.landvehicles.ILandVehicle;
import br.com.study.abstractfacthory.landvehicles.Motorcycle;

public class NineNineTransportFactory implements ITransportLandFactory,ITransportAirVehicle {
    @Override
    public ILandVehicle createTransportLandVehicle() {
        return new Motorcycle();
    }

    @Override
    public IAircraft createTransportAircraft() {
        return new Helicopter();
    }
}
