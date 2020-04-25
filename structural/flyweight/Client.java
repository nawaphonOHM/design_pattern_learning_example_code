package structural.flyweight;

import java.util.Random;

import structural.flyweight.flyweight.Player;
import structural.flyweight.flyweight_factory.PlayerFactory;
import structural.flyweight.type.PlayerTypes;
import structural.flyweight.type.Weapons;

public class Client {
    private static PlayerTypes[] playerType = {
        PlayerTypes.TERRORIST, 
        PlayerTypes.COUNTER_TERRORIST
    };
    private static Weapons[] weapons = {
        Weapons.AK47, 
        Weapons.MAVERICK, 
        Weapons.GUT_KNIFE, 
        Weapons.DESERT_EAGLE
    };

    public static void main(String args[]){
        for(int i = 0; i < 1024; i++){
            Player player = PlayerFactory.getPlayer(getRandPlayerType());

            player.assignWeapon(getRandWeapon());

            player.mission();
        }
    }

    public static PlayerTypes getRandPlayerType(){
        return playerType[(new Random()).nextInt(playerType.length)];
    }

    public static Weapons getRandWeapon(){
        return weapons[(new Random()).nextInt(weapons.length)];
    }
}