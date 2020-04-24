package structural.decorator.components.implementations;

import structural.decorator.components.Pizza;

public class FarmHouse extends Pizza {

    public FarmHouse(){
        this.description = "FarmHouse";
    }

    @Override
    public int getCost() {
        return 200;
    }

}