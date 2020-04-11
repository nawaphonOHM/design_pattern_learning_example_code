package structural.bridge.cruxes;

import structural.bridge.implementors.Workshop;

public abstract class Vehicle {
    final protected Workshop workshop1;
    final protected Workshop workShop2;

    protected Vehicle(Workshop workShop1, Workshop workShop2){
        this.workshop1 = workShop1;
        this.workShop2 = workShop2;
    }

    abstract public void manufacture();
}