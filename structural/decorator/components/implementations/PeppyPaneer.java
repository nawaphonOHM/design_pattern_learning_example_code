package structural.decorator.components.implementations;

import structural.decorator.components.Pizza;

public class PeppyPaneer extends Pizza {

    public PeppyPaneer(){
        this.description = "PeppyPaneer";
    }

    @Override
    public int getCost() {
        return 100;
    }

}