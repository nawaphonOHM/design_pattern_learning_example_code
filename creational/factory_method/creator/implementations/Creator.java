package creational.factory_method.creator.implementations;

import creational.factory_method.creator.CreatableRequirement;
import creational.factory_method.others.Wheeler;
import creational.factory_method.product.Vehicle;
import creational.factory_method.product.implementations.FourWheeler;
import creational.factory_method.product.implementations.ThreeWheeler;
import creational.factory_method.product.implementations.TwoWheeler;

public class Creator extends CreatableRequirement {

    @Override
    protected Vehicle buildVehicleByWheeler(Wheeler wheelerAmount) {
        final Vehicle vehicle;

        switch(wheelerAmount){
            case TWO_WHEELER:
                vehicle = new TwoWheeler();
                break;
            case THREE_WHEELER:
                vehicle = new ThreeWheeler();
                break;
            case FOUR_WHEELER:
                vehicle = new FourWheeler();
                break;
            default:
                vehicle = null;
                break;
        }

        return vehicle;
    }

}