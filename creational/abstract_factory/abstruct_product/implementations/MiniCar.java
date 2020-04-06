package creational.abstract_factory.abstruct_product.implementations;

import creational.abstract_factory.abstruct_product.Car;
import creational.abstract_factory.others.CarLevel;

public class MiniCar implements Car {
    final private String platform;
    final private CarLevel level;

    public MiniCar(){
        this.platform = "mini";
        this.level = CarLevel.NORMAL;
    }

    @Override
    public String getPlatform() {
        return this.platform;
    }

    @Override
    public CarLevel getLevel() {
        return this.level;
    }

}