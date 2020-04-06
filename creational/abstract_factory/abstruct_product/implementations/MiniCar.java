package creational.abstract_factory.abstruct_product.implementations;

import creational.abstract_factory.abstruct_product.Car;

public class MiniCar implements Car {

    @Override
    public String getDescrption() {
        return "Connecting to Mini car.";
    }

}