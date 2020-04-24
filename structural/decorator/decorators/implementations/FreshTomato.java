package structural.decorator.decorators.implementations;

import structural.decorator.components.Pizza;
import structural.decorator.decorators.ToppingDecorator;

public class FreshTomato extends ToppingDecorator {

    private final Pizza pizza;

    public FreshTomato(Pizza pizza){
        this.pizza = pizza;
    }

    @Override
    public String getDescription() {
        String returnedString = "Fresh Tomato";
        if(this.pizza != null){
            return this.pizza.getDescription() + ", " + returnedString + " ";
        } else {
            return returnedString;
        }
    }

    @Override
    public int getCost() {
        int price = 40;
        if(this.pizza != null){
            return price + this.pizza.getCost();
        } else {
            return price;
        }
    }

}