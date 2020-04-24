package structural.facade.interfaces.implementations;

import structural.facade.interfaces.Hotel;
import structural.facade.types.Menus;
import structural.facade.types.implementations.Both;

public class VegNonBothRestaurant implements Hotel {

    @Override
    public Menus getMenus() {
        return new Both();
    }

}