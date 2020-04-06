package creational.factory_method.product.implementations;

import creational.factory_method.others.Size;
import creational.factory_method.product.Vehicle;

public class ThreeWheeler implements Vehicle {
    final private Size size;
    final private String name;

    public ThreeWheeler(){
        this.size = Size.MEDIUM;
        this.name = "three wheel";
    }

    @Override
    public Size getVehicleSize() {
        return this.size;
    }

    @Override
    public String getName() {
        return this.name;
    }

}