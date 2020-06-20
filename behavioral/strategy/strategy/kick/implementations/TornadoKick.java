package behavioral.strategy.strategy.kick.implementations;

import behavioral.strategy.strategy.kick.KickBehavior;

public class TornadoKick implements KickBehavior {

    @Override
    public void kick() {
        System.out.println("Tornado Kick");
    }
    
}