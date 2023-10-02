package br.com.study.abstractfacthory.factories;

import br.com.study.abstractfacthory.landvehicles.ILandVehicle;
import br.com.study.abstractfacthory.seavehicles.ISeaVehicle;

public interface ITransportSeaFactory{
    ISeaVehicle createTransportSeaVehicle();
}
