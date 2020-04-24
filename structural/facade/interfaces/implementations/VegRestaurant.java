package structural.facade.interfaces.implementations;

import structural.facade.interfaces.Hotel;
import structural.facade.types.Menus;
import structural.facade.types.implementations.VegMenu;

public class VegRestaurant implements Hotel {

    @Override
    public Menus getMenus() {
        return new VegMenu();
    }

}