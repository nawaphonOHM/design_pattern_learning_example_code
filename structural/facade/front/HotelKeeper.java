package structural.facade.front;

import structural.facade.interfaces.implementations.NonVegRestaurant;
import structural.facade.interfaces.implementations.VegNonBothRestaurant;
import structural.facade.interfaces.implementations.VegRestaurant;
import structural.facade.types.implementations.Both;
import structural.facade.types.implementations.NonVegMenu;
import structural.facade.types.implementations.VegMenu;

public interface HotelKeeper {
    public VegMenu getVegMenu();
    public NonVegMenu getNonVegMenu();
    public Both getVegNonMenu();
}