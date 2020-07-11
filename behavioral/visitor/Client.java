package behavioral.visitor;

import java.util.ArrayList;
import java.util.List;

import behavioral.visitor.elements.ItemElement;
import behavioral.visitor.elements.implementations.Book;
import behavioral.visitor.elements.implementations.Fruit;
import behavioral.visitor.visitors.implementation.ShoppingCartVisitor;

public class Client {
    public static void main(String[] args) {
        final List<ItemElement> items = new ArrayList<ItemElement>();

        items.add(new Book(200, "43435"));
        items.add(new Book(1000, "24534"));

        items.add(new Fruit(10, 2, "banana"));
        items.add(new Fruit(5, 5, "Apple"));

        final Number total = calculatePrice(items);

        System.out.println("Total Cost = " + total);
    }

    private static Number calculatePrice(List<ItemElement> items){
        final ShoppingCartVisitor visitor = new ShoppingCartVisitor();

        Number sum = 0;

        for(ItemElement item : items){
            sum = sum.doubleValue() + item.accept(visitor).doubleValue();
        }

        return sum;
    }
}