package structural.flyweight.flyweight;

import structural.flyweight.type.Weapons;

public interface Player {
    public void assignWeapon(Weapons weapon);
    public void mission();
}