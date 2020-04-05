package creational.abstract_factory.source.templates;

import creational.abstract_factory.state.CarType;
import creational.abstract_factory.state.Location;

public abstract class Car extends Object{

    private CarType model;
    private Location location;

    protected Car(CarType model, Location location){
        this.model = model;
        this.location = location;
    }

    protected abstract void construct();

    CarType getModel(){
        return this.model;
    }
    Location getLocation(){
        return this.location;
    }
    
    void setLocation(Location location){
        this.location = location;
    }

    @Override
    public String toString(){
        return "CarModel - " + model + " located in " + location;
    }



}