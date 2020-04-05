package creational.builder.source.director;

import creational.builder.abstruct_factory_application.implementations.House;
import creational.builder.source.templates.HouseBuilder;

public class CivilEngineer {
    final private HouseBuilder houseBuilder;

    public CivilEngineer(HouseBuilder houseBuilder){
        this.houseBuilder = houseBuilder;
    }

    public House getHouse(){
        return this.houseBuilder.getHouse();
    }

    public void constructHouse(){
        this.houseBuilder.buildBasement();
        this.houseBuilder.buildStructure();
        this.houseBuilder.buildRoof();
        this.houseBuilder.buildInterior();
    }
}