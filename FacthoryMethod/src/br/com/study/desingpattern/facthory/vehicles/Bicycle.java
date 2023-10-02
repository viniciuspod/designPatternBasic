package br.com.study.desingpattern.facthory.vehicles;

public class Bicycle implements IVehicle {
    @Override
    public void startRoute() {
        getCargo();
        System.out.println("comecando a entrega da comida de bike");
    }

    @Override
    public void getCargo() {
        System.out.println("pegando a comida");
    }
}
