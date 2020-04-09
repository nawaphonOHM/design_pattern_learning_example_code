package creational.singleton.vehicle_factory;

import creational.factory_method.creator.implementations.Creator;

public class VehicleFactory {
    private volatile static Creator factory;

    private VehicleFactory(){};

    public static Creator getFactory(){
        if(factory == null){

            synchronized(VehicleFactory.class){
                if(factory == null){
                    factory = new Creator();
                }
            }
        }

        return factory;
    }
}