package creational.builder.source.templates;

import creational.builder.abstruct_factory_application.implementations.House;

public interface HouseBuilder {
    public void buildBasement();
    public void buildStructure();
    public void buildRoof();
    public void buildInterior();
    public House getHouse();
}