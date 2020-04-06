package creational.factory_method.product.implementations;

import creational.factory_method.others.Size;
import creational.factory_method.product.Vehicle;

public class FourWheeler implements Vehicle {
    final private Size size;
    final private String name;

    public FourWheeler(){
        this.size = Size.BIG;
        this.name = "four wheel";
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