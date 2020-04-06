package creational.factory_method.creator;

import creational.factory_method.others.Wheeler;
import creational.factory_method.product.Vehicle;
import creational.factory_method.product.implementations.FourWheeler;

public abstract class CreatableRequirement {
    abstract protected Vehicle buildVehicleByWheeler(Wheeler wheelerAmount);

    public Vehicle buildVehicle(){
        return new FourWheeler();
    }

    public Vehicle buildVehicle(Wheeler wheelerAmount){

        return buildVehicleByWheeler(wheelerAmount);
    }
}