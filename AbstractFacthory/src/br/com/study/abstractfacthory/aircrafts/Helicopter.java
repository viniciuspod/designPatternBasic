package br.com.study.abstractfacthory.aircrafts;

public class Helicopter implements IAircraft{
    @Override
    public void startRoute() {
        wind();
        getCarga();
        System.out.println("iniciando a decolagem");
    }

    @Override
    public void getCarga() {
        System.out.println("pegando passageiros ligando helices");
    }

    @Override
    public void wind() {
        System.out.println("ventos OK a 50 km");
    }
}
