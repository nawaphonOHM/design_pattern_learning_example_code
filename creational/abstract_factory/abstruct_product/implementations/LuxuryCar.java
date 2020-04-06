package creational.abstract_factory.abstruct_product.implementations;

import creational.abstract_factory.abstruct_product.Car;
import creational.abstract_factory.others.CarLevel;
import javafx.application.Platform;

public class LuxuryCar implements Car {
    final private String platform;
    final private CarLevel level;

    public LuxuryCar(){
        this.platform = "luxury";
        this.level = CarLevel.HIGH;
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