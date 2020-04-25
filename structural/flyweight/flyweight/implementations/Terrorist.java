package structural.flyweight.flyweight.implementations;

import structural.flyweight.flyweight.Player;
import structural.flyweight.type.Weapons;

public class Terrorist implements Player {

    private final String TASK;

    private Weapons weapon;

    public Terrorist(){
        TASK = "PLANT A BOMB";
    }

    @Override
    public void assignWeapon(Weapons weapon) {
        this.weapon = weapon;
    }

    @Override
    public void mission() {
        System.out.println("Terrorist with weapon " + weapon + "|" + " Task is " + TASK);
    }

}