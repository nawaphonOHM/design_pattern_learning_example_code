package structural.decorator.decorators;

import structural.decorator.components.Pizza;

public abstract class ToppingDecorator extends Pizza{
    public abstract String getDescription();
}