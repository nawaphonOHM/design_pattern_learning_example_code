package structural.adapter.adaptees.implementations;

import structural.adapter.adaptees.Bird;

public class Sparrow implements Bird {

    @Override
    public void fly(){
        System.out.println("Flying");
    }

    @Override
    public void makeSound(){
        System.out.println("Chirp Chirp");
    }
}