package br.com.study.desingpattern.facthory;

import br.com.study.desingpattern.facthory.vehicles.IVehicle;
import br.com.study.desingpattern.facthory.vehicles.Mothorcycle;

public class MothorcycleTransport extends Transport{
    @Override
    protected IVehicle createTransport() {
        return new Mothorcycle();
    }
}
