package br.com.study.builder.builders;

import br.com.study.builder.components.CarType;
import br.com.study.builder.components.Engine;
import br.com.study.builder.components.Transmission;

public interface IBuilder {

    void setCarType(CarType cartype);
    void setSeats(int seats);
    void setTransmission(Transmission transmission);
    void setEngine(Engine engine);
}
