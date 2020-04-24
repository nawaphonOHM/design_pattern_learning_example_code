package structural.decorator.components.implementations;

import structural.decorator.components.Pizza;

public class Margherita extends Pizza {

    public Margherita(){
        this.description = "Margherita";
    }

    @Override
    public int getCost() {
        return 100;
    }

}