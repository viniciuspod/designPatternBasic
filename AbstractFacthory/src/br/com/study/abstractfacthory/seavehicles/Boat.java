package br.com.study.abstractfacthory.seavehicles;

public class Boat implements ISeaVehicle {
    @Override
    public void startRoute() {
        getCarga();
        System.out.println("iniciando navegação");
    }

    @Override
    public void getCarga() {
        System.out.println("completando carga no porto");
    }
}
