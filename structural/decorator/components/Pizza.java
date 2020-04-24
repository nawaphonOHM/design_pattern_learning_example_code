package structural.decorator.components;

public abstract class Pizza {
    protected String description = null;
    
    public String getDescription(){
        return this.description;
    };
    public abstract int getCost();
}