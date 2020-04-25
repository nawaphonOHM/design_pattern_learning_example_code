package structural.flyweight.flyweight_factory;

import java.util.HashMap;
import java.util.Map;

import structural.flyweight.flyweight.Player;
import structural.flyweight.flyweight.implementations.CounterTerrorist;
import structural.flyweight.flyweight.implementations.Terrorist;
import structural.flyweight.type.PlayerTypes;

public class PlayerFactory {
    private static Map<PlayerTypes, Player> hashMap = new HashMap<PlayerTypes, Player>();

    public static Player getPlayer(PlayerTypes type){
        final Player player;

        if(hashMap.containsKey(type)){
            player = hashMap.get(type);
        } else {
            switch(type){
                case TERRORIST:
                    System.out.println("Terrorist Created");
                    player = new Terrorist();
                    break;
                case COUNTER_TERRORIST:
                    System.out.println("Counter Terrorist Created");
                    player = new CounterTerrorist();
                    break;
                default:
                    System.out.println("Unreachable code!");
                    player = null;
            }

            hashMap.put(type, player);
        }

        return player;
    }
}