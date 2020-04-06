package creational.factory_method.client_implementation;

import creational.factory_method.source.template.Vehicle;
import creational.factory_method.state.VehicleType;

public class Client {
    final public VehicleType type = VehicleType.VT_ThreeWheeler;
    final private Vehicle pVehicle = Vehicle.create(type);

    public Vehicle getVehicle(){
        return this.pVehicle;
    }
}