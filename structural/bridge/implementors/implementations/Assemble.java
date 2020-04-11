package structural.bridge.implementors.implementations;

import structural.bridge.implementors.Workshop;

public class Assemble implements Workshop {

    @Override
    public void work() {
        System.out.print(" And");
        System.out.println(" Assembled.");
    }

}