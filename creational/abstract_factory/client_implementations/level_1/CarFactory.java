package creational.abstract_factory.client_implementations.level_1;

import creational.abstract_factory.client_implementations.level_0.DefaultCarFactory;
import creational.abstract_factory.client_implementations.level_0.IndiaCarFactory;
import creational.abstract_factory.client_implementations.level_0.UsaCarFactory;
import creational.abstract_factory.source.templates.Car;
import creational.abstract_factory.state.CarType;
import creational.abstract_factory.state.Location;

public class CarFactory {
    private CarFactory(){

    }

    public static Car buildCar(CarType type){
        final Car car;
        final Location location = Location.INDIA;

        switch(location){
            case USA:
                car = UsaCarFactory.buildCar(type);
                break;
            case INDIA:
                car = IndiaCarFactory.buildCar(type);
                break;
            default:
                car = DefaultCarFactory.buildCar(type);
        }

        return car;
    }
}