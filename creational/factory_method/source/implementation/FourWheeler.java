package creational.factory_method.source.implementation;

import creational.factory_method.source.template.Vehicle;

public class FourWheeler extends Vehicle {
    @Override
    public void printVehicle(){
        System.out.println("I am four wheeler");
    }
}