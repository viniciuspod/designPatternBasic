package br.com.study.abstractfacthory.landvehicles;

public class Motorcycle implements ILandVehicle{
    @Override
    public void startRoute() {
        getCarga();
        System.out.println("iniciando a entrega");
    }

    @Override
    public void getCarga() {
        System.out.println("pegando a carga da entrega");
    }
}
