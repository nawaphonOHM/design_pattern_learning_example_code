package structural.bridge.finers;

import structural.bridge.cruxes.Vehicle;
import structural.bridge.implementors.Workshop;

public class Car extends Vehicle {

    public Car(Workshop workShop1, Workshop workShop2){
        super(workShop1, workShop2);
    }

    @Override
    public void manufacture() {
        System.out.print("Car ");
        workshop1.work();
        workShop2.work();

    }

}