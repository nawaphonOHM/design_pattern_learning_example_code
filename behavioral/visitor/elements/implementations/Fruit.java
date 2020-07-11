package behavioral.visitor.elements.implementations;

import behavioral.visitor.elements.ItemElement;
import behavioral.visitor.visitors.ShoppingCart;

public class Fruit implements ItemElement {

    final private int pricePerKg;
    final private int weight;
    final private String name;

    public Fruit(int pricePerKg, int weight, String name){
        this.pricePerKg = pricePerKg;
        this.weight = weight;
        this.name = name;
    }

    public int getPricePerKg() {
        return this.pricePerKg;
    }

    public int getWeight() {
        return this.weight;
    }

    public String getName() {
        return this.name;
    }

    @Override
    public Number accept(ShoppingCart visitor) {
        return visitor.visit(this);
    }
    
}