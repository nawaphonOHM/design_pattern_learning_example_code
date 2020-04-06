package creational.factory_method.source.template;

import creational.factory_method.source.implementation.FourWheeler;
import creational.factory_method.source.implementation.ThreeWheeler;
import creational.factory_method.source.implementation.TwoWheeler;
import creational.factory_method.state.VehicleType;

public abstract class Vehicle {
    public abstract void printVehicle();
    public static Vehicle create(VehicleType type){
        final Vehicle vehicle;

        switch(type){
            case VT_TwoWheeler:
                vehicle = new TwoWheeler();
                break;
            case VT_ThreeWheeler:
                vehicle = new ThreeWheeler();
                break;
            case VT_FourWheeler:
                vehicle = new FourWheeler();
                break;
            default:
                vehicle = null;
                break;
        }

        return vehicle;
    }
}