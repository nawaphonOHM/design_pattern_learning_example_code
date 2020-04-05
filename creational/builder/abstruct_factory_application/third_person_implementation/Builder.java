package creational.builder.abstruct_factory_application.third_person_implementation;

import creational.builder.abstruct_factory_application.implementations.House;
import creational.builder.source.director.CivilEngineer;
import creational.builder.source.implementations.IglooHouseBuilder;
import creational.builder.source.templates.HouseBuilder;

public class Builder {
    public static void main(String[] args){
        final HouseBuilder iglooBuilder = new IglooHouseBuilder();
        final CivilEngineer engineer = new CivilEngineer(iglooBuilder);

        engineer.constructHouse();

        final House house = engineer.getHouse();

        System.out.println("Builder constructed: " + house);
    }
}