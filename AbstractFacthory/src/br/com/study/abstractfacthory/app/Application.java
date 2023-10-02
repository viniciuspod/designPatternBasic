package br.com.study.abstractfacthory.app;

import br.com.study.abstractfacthory.aircrafts.IAircraft;
import br.com.study.abstractfacthory.factories.ITransportAirVehicle;
import br.com.study.abstractfacthory.factories.ITransportLandFactory;
import br.com.study.abstractfacthory.factories.ITransportSeaFactory;
import br.com.study.abstractfacthory.landvehicles.ILandVehicle;
import br.com.study.abstractfacthory.seavehicles.ISeaVehicle;

public class Application {

    private ILandVehicle iLandVehicle;
    private IAircraft iAircraft;
    private ISeaVehicle iSeaVehicle;

    public Application(ITransportLandFactory factoryLand, ITransportAirVehicle factoryAir){
        iLandVehicle = factoryLand.createTransportLandVehicle();
        iAircraft =  factoryAir.createTransportAircraft();
    }
    public Application(ITransportSeaFactory factorySea){
        iSeaVehicle = factorySea.createTransportSeaVehicle();
    }

    public void startRoute(){
        if (iLandVehicle != null) {
            iLandVehicle.startRoute();
        }
        if (iAircraft != null) {
            iAircraft.startRoute();
        }
        if (iSeaVehicle != null) {
            iSeaVehicle.startRoute();
        }
    }
}
