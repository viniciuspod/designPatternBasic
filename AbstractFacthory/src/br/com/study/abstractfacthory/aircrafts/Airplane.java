package br.com.study.abstractfacthory.aircrafts;

public class Airplane implements IAircraft{
    @Override
    public void startRoute() {
        wind();
        getCarga();
        System.out.println("iniciando a decolagem");
    }

    @Override
    public void getCarga() {
        System.out.println("passageiros a bordo");
    }

    @Override
    public void wind() {
        System.out.println("ventos a 25km");
    }
}
