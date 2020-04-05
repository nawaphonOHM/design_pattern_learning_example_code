package creational.abstract_factory.third_person_implemention;

import creational.abstract_factory.client_implementations.level_1.CarFactory;
import creational.abstract_factory.state.CarType;

class AbstractDesign {
    public static void main(String[] args){
        System.out.println(CarFactory.buildCar(CarType.MICRO));
        System.out.println(CarFactory.buildCar(CarType.MINI));
        System.out.println(CarFactory.buildCar(CarType.LUXURY));
    }
}