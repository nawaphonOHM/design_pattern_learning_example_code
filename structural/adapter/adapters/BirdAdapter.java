package structural.adapter.adapters;

import structural.adapter.adaptees.Bird;
import structural.adapter.adaptees.ToyDuck;

public class BirdAdapter implements ToyDuck {
    private final Bird bird;

    public BirdAdapter(Bird bird){
        this.bird = bird;
    }

    @Override
    public void squeak() {
        this.bird.makeSound();
    }

}