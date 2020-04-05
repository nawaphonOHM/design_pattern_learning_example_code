package creational.builder.source.implementations;

import creational.builder.abstruct_factory_application.implementations.House;
import creational.builder.source.templates.HouseBuilder;

public class IglooHouseBuilder implements HouseBuilder {
    final private House house;

    public IglooHouseBuilder(){
        this.house = new House();
    }

    @Override
    public void buildBasement(){
        house.setBasement("Ice Bars");
    }

    @Override
    public void buildStructure(){
        house.setStructure("Ice Blocks");
    }

    @Override
    public void buildInterior(){
        house.setInterior("Ice Carving");
    }

    @Override
    public void buildRoof(){
        house.setRoof("Ice Dome");
    }

    @Override
    public House getHouse(){
        return this.house;
    }
}