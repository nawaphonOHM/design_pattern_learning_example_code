package behavioral.visitor.visitors;

import behavioral.visitor.elements.implementations.Book;
import behavioral.visitor.elements.implementations.Fruit;

public interface ShoppingCart {
    public Number visit(Book book);
    public Number visit(Fruit fruit);  
}