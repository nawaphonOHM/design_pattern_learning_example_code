package creational.factory_method.source.implementation;

import creational.factory_method.source.template.Vehicle;

public class TwoWheeler extends Vehicle {
    @Override
    public void printVehicle(){
        System.out.println("I am two wheeler");
    }
}