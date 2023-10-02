package br.com.study.desingpattern.facthory.vehicles;

public class Car implements IVehicle {
    @Override
    public void startRoute() {
        getCargo();
        System.out.println("iniciando o trajeto");
    }

    @Override
    public void getCargo() {
        System.out.println("pegamos os passageiros!");
    }
}

