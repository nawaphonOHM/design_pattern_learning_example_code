package structural.bridge;

import structural.bridge.cruxes.Vehicle;
import structural.bridge.finers.Bike;
import structural.bridge.finers.Car;
import structural.bridge.implementors.implementations.Assemble;
import structural.bridge.implementors.implementations.Produce;

public class Client {
    public static void main(String[] args){
        Vehicle vehicle1 = new Car(new Produce(), new Assemble());
        vehicle1.manufacture();
        Vehicle vehicle2 = new Bike(new Produce(), new Assemble());
        vehicle2.manufacture();
    }
}