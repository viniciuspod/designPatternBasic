package br.com.study.abstractfacthory.factories;

import br.com.study.abstractfacthory.seavehicles.Boat;
import br.com.study.abstractfacthory.seavehicles.ISeaVehicle;

public class BoatTransportFactory implements ITransportSeaFactory {

    @Override
    public ISeaVehicle createTransportSeaVehicle() {
        return new Boat();
    }
}
