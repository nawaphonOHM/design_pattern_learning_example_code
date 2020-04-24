package structural.facade;

import structural.facade.front.HotelKeeper;
import structural.facade.front.implementations.HotelKeeperImplement;
import structural.facade.types.implementations.Both;
import structural.facade.types.implementations.NonVegMenu;
import structural.facade.types.implementations.VegMenu;

public class Client {
    public static void main(String[] args){
        final HotelKeeper keeper = new HotelKeeperImplement();

        VegMenu v = keeper.getVegMenu();
        NonVegMenu nv = keeper.getNonVegMenu();
        Both bo = keeper.getVegNonMenu();
    }
}