package creational.abstract_factory.car_branch_factory.implementations;

import creational.abstract_factory.abstruct_product.Car;
import creational.abstract_factory.abstruct_product.implementations.MiniCar;
import creational.abstract_factory.car_branch_factory.CarFactory;

public class ThaiCarFactory implements CarFactory{

    @Override
    public Car getCar(){
        return new MiniCar();
    }
    
}