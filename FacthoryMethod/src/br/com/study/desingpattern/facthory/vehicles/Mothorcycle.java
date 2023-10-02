package br.com.study.desingpattern.facthory.vehicles;

public class Mothorcycle implements IVehicle {
    @Override
    public void startRoute() {
        getCargo();
        System.out.println("iniciando a entrega");
    }

    @Override
    public void getCargo() {
        System.out.println("Ja pegamos a encomenda");
    }
}
