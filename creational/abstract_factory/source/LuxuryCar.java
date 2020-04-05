package creational.abstract_factory.source;

import creational.abstract_factory.state.CarType;
import creational.abstract_factory.state.Location;

public class LuxuryCar extends Car {

    public LuxuryCar(Location location){
        super(CarType.LUXURY, location);
        construct();
    }

    @Override
    protected void construct(){
        System.out.println("Connecting to luxury car");
    }
}