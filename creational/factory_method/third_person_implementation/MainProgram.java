package creational.factory_method.third_person_implementation;

import creational.factory_method.client_implementation.Client;
import creational.factory_method.source.template.Vehicle;

public class MainProgram {
    public static void main(String[] args){
        final Client pClient = new Client();
        final Vehicle pVehicle = pClient.getVehicle();

        pVehicle.printVehicle();
    }
}