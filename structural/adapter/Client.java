package structural.adapter;

import structural.adapter.adaptees.ToyDuck;
import structural.adapter.adaptees.implementations.PlasticToyDuck;
import structural.adapter.adaptees.implementations.Sparrow;
import structural.adapter.adapters.BirdAdapter;

public class Client {
    public static void main(String[] args) {
        final Sparrow sparrow = new Sparrow();
        final ToyDuck toyDuck = new PlasticToyDuck();
        
        //Hey, I want Toy Duck can squeak like birds, could you do it? 
        final ToyDuck birdAdapter = new BirdAdapter(sparrow);

        System.out.println("Sparrow");
        sparrow.fly();
        sparrow.makeSound();

        System.out.println("ToyDuck...");
        toyDuck.squeak();

        System.out.println("BirdAdapter...");
        birdAdapter.squeak();
    }
}