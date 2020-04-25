package structural.flyweight.flyweight.implementations;

import structural.flyweight.flyweight.Player;
import structural.flyweight.type.Weapons;

public class CounterTerrorist implements Player {

    private final String TASK;

    private Weapons weapon;

    public CounterTerrorist(){
        TASK = "DIFFUSE BOMB";
    }

    @Override
    public void assignWeapon(Weapons weapon) {
        this.weapon = weapon;
    }

    @Override
    public void mission() {
        System.out.println("Counter Terrorist with weapon " + weapon + "|" + " Task is " + TASK);
    }

}