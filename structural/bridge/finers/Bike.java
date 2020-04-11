package structural.bridge.finers;

import structural.bridge.cruxes.Vehicle;
import structural.bridge.implementors.Workshop;

public class Bike extends Vehicle {

    public Bike(Workshop workShop1, Workshop workShop2){
        super(workShop1, workShop2);
    }

    @Override
    public void manufacture() {
        System.out.print("Bike ");
        workshop1.work();
        workShop2.work();
    }

}