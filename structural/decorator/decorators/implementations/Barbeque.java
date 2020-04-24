package structural.decorator.decorators.implementations;

import structural.decorator.components.Pizza;
import structural.decorator.decorators.ToppingDecorator;

public class Barbeque extends ToppingDecorator {
    private final Pizza pizza;

    public Barbeque(Pizza pizza){
        this.pizza = pizza;
    }

    @Override
    public String getDescription() {
        String returnedString = "Barbeque";
        if(this.pizza != null){
            return this.pizza.getDescription() + ", " + returnedString + " ";
        } else {
            return returnedString;
        }
    }

    @Override
    public int getCost() {
        int price = 90;
        if(this.pizza != null){
            return price + this.pizza.getCost();
        } else {
            return price;
        }
    }

}