package br.com.study.abstractfacthory.landvehicles;

public class Car implements ILandVehicle{
    @Override
    public void startRoute() {
        getCarga();
        System.out.println("iniciando o trajeto");
    }

    @Override
    public void getCarga() {
        System.out.println("pegamos os passageiros");
    }
}
