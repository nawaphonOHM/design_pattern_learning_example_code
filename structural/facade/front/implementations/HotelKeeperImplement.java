package structural.facade.front.implementations;

import structural.facade.front.HotelKeeper;
import structural.facade.interfaces.implementations.NonVegRestaurant;
import structural.facade.interfaces.implementations.VegNonBothRestaurant;
import structural.facade.interfaces.implementations.VegRestaurant;
import structural.facade.types.implementations.Both;
import structural.facade.types.implementations.NonVegMenu;
import structural.facade.types.implementations.VegMenu;

public class HotelKeeperImplement implements HotelKeeper {

    @Override
    public VegMenu getVegMenu(){
        return (VegMenu)(new VegRestaurant()).getMenus();
    }

    @Override
    public NonVegMenu getNonVegMenu(){
        return (NonVegMenu)(new NonVegRestaurant()).getMenus();
    }

    @Override
    public Both getVegNonMenu(){
        return (Both)(new VegNonBothRestaurant()).getMenus();
    }
}