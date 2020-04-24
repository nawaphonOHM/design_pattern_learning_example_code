package structural.decorator;

import structural.decorator.components.Pizza;
import structural.decorator.components.implementations.FarmHouse;
import structural.decorator.components.implementations.Margherita;
import structural.decorator.decorators.implementations.Barbeque;
import structural.decorator.decorators.implementations.FreshTomato;
import structural.decorator.decorators.implementations.Paneer;

public class Client {
    public static void main(String args[]){
        final Pizza pizza = new Margherita();

        System.out.println(pizza.getDescription() + " Cost: " + pizza.getCost());

        Pizza pizza2 = new FarmHouse();
        pizza2 = new FreshTomato(pizza2);
        pizza2 = new Paneer(pizza2);

        System.out.println(pizza2.getDescription() + "Cost: " + pizza2.getCost());

        Pizza pizza3 = new Barbeque(null);

        System.out.println(pizza3.getDescription() + " Cost: " + pizza3.getCost());
    }
}