package structural.decorator.components.implementations;

import structural.decorator.components.Pizza;

public class SimplePizza extends Pizza {

    public SimplePizza(){
        this.description = "SimplePizza";
    }

    @Override
    public int getCost() {
        return 50;
    }

}