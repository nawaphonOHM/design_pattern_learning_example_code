package structural.facade.interfaces.implementations;

import structural.facade.interfaces.Hotel;
import structural.facade.types.Menus;
import structural.facade.types.implementations.NonVegMenu;

public class NonVegRestaurant implements Hotel {

    @Override
    public Menus getMenus() {
        return new NonVegMenu();
    }

}