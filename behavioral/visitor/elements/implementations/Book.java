package behavioral.visitor.elements.implementations;

import behavioral.visitor.elements.ItemElement;
import behavioral.visitor.visitors.ShoppingCart;

public class Book implements ItemElement {
    
    final private int price;
    final private String isbnNumber;

    public Book(int cost, String isbn){
        this.price = cost;
        this.isbnNumber = isbn;
    }

    public int getPrice(){
        return this.price;
    }

    public String getIsbnNumber(){
        return isbnNumber;
    }

    @Override
    public Number accept(ShoppingCart visitor) {
        return visitor.visit(this);
    }
    
}