package structural.decorator.components.implementations;

import structural.decorator.components.Pizza;

public class ChickenFiesta extends Pizza {

    public ChickenFiesta(){
        this.description = "ChickenFieta";
    }

    @Override
    public int getCost() {
        return 200;
    }

}