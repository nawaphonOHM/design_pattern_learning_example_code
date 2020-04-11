package structural.adapter.adaptees.implementations;

import structural.adapter.adaptees.ToyDuck;

public class PlasticToyDuck implements ToyDuck {

    @Override
    public void squeak() {
        System.out.println("Spueak");
    }

}