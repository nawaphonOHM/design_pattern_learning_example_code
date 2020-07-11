package behavioral.visitor.visitors.implementation;

import behavioral.visitor.elements.implementations.Book;
import behavioral.visitor.elements.implementations.Fruit;
import behavioral.visitor.visitors.ShoppingCart;

public class ShoppingCartVisitor implements ShoppingCart {

    @Override
    public Number visit(Book book) {
        Number cost = book.getPrice();

        if(book.getPrice() >= 500){
            cost = cost.doubleValue() * 0.90; //discount for 10%;
        }

        System.out.println("Book ISBN::" + book.getIsbnNumber() + "price = " + cost);

        return cost;
    }

    @Override
    public Number visit(Fruit fruit) {
        final int cost = fruit.getPricePerKg() * fruit.getWeight();

        System.out.println(fruit.getName() + " cost = " + cost);
        return cost;
    }
    
}