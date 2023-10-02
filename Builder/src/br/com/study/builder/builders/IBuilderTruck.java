package br.com.study.builder.builders;

import br.com.study.builder.components.Horse;

public interface IBuilderTruck extends IBuilder{
    void setHorse(Horse horse);
}
