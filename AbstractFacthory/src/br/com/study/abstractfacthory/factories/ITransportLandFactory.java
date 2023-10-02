package br.com.study.abstractfacthory.factories;

import br.com.study.abstractfacthory.aircrafts.IAircraft;
import br.com.study.abstractfacthory.landvehicles.ILandVehicle;

public interface ITransportLandFactory {
    ILandVehicle createTransportLandVehicle();

}
