package creational.abstract_factory.car_branch_factory.implementations;

import creational.abstract_factory.abstruct_product.Car;
import creational.abstract_factory.abstruct_product.implementations.LuxuryCar;
import creational.abstract_factory.car_branch_factory.CarFactory;

public class UsaCarFactory implements CarFactory{

    @Override
    public Car getCar(){
        return new LuxuryCar();
    }

    
}