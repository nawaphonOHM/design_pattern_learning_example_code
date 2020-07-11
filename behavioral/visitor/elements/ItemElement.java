package behavioral.visitor.elements;

import behavioral.visitor.visitors.ShoppingCart;

public interface ItemElement {

    public Number accept(ShoppingCart visitor);
}