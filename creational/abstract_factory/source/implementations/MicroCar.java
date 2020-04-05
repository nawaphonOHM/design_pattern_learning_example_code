package creational.abstract_factory.source.implementations;

import creational.abstract_factory.source.templates.Car;
import creational.abstract_factory.state.CarType;
import creational.abstract_factory.state.Location;

public class MicroCar extends Car {

    public MicroCar(Location location){
        super(CarType.MICRO, location);
        construct();
    }

    @Override
    protected void construct(){
        System.out.println("Connecting to Micro Car");
    }
}