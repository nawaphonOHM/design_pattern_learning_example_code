package creational.abstract_factory.source;

import creational.abstract_factory.state.CarType;
import creational.abstract_factory.state.Location;

public class MiniCar extends Car {
    public MiniCar(Location location){
        super(CarType.MINI, location);
        construct();
    }

    @Override
    void construct(){
        System.out.println("Connecting to Mini car");
    }
}