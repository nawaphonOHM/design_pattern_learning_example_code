package creational.abstract_factory.client_implementations.level_0;

import creational.abstract_factory.source.implementations.LuxuryCar;
import creational.abstract_factory.source.implementations.MicroCar;
import creational.abstract_factory.source.implementations.MiniCar;
import creational.abstract_factory.source.templates.Car;
import creational.abstract_factory.state.CarType;
import creational.abstract_factory.state.Location;

public class IndiaCarFactory {
    public static Car buildCar(CarType model){
        Car car = null;

        switch(model){
            case MICRO:
                car = new MicroCar(Location.INDIA);
                break;
            case MINI:
                car = new MiniCar(Location.INDIA);
                break;
            case LUXURY:
                car = new LuxuryCar(Location.INDIA);
                break;

            default:
                break;    
        }

        return car;
    }
}