package creational.abstract_factory.car_branch_factory.implementations;

import creational.abstract_factory.abstruct_product.Car;
import creational.abstract_factory.abstruct_product.implementations.MicroCar;
import creational.abstract_factory.car_branch_factory.CarFactory;

public class IndiaCarFactory implements CarFactory {

    @Override
    public Car getCar(){
        return new MicroCar();
    }

}