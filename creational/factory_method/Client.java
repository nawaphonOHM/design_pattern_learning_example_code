package creational.factory_method;

import creational.factory_method.creator.implementations.Creator;
import creational.factory_method.others.Wheeler;
import creational.factory_method.product.Vehicle;

public class Client {
    public static void main(String[] args){
        final Creator builder = new Creator();
        Vehicle product;


        System.out.println("This is default size vehicle from vehicle!");
        product = builder.buildVehicle();
        System.out.println(product.getVehicleSize());

        System.out.println("This is size from 2 wheels vehicle!");
        product = builder.buildVehicle(Wheeler.TWO_WHEELER);
        System.out.println(product.getVehicleSize());

        System.out.println("This is size from 3 wheels vehicle!");
        product = builder.buildVehicle(Wheeler.THREE_WHEELER);
        System.out.println(product.getVehicleSize());

        System.out.println("This is size from 4 wheels vehicle!");
        product = builder.buildVehicle(Wheeler.FOUR_WHEELER);
        System.out.println(product.getVehicleSize());
        
    }
}