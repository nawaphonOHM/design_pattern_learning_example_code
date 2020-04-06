package creational.factory_method.product.implementations;

import creational.factory_method.others.Size;
import creational.factory_method.product.Vehicle;

public class TwoWheeler implements Vehicle{
    final private Size size;
    final private String name;

    public TwoWheeler(){
        this.size = Size.SMALL;
        this.name = "two wheel";
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