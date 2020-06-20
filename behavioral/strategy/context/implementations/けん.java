package behavioral.strategy.context.implementations;

import behavioral.strategy.context.Fighter;
import behavioral.strategy.strategy.jump.JumpBehavior;
import behavioral.strategy.strategy.kick.KickBehavior;

public class けん extends Fighter {

    public けん(KickBehavior kickBehavior, JumpBehavior jumpBehavior) {
        super(kickBehavior, jumpBehavior);
    }

    @Override
    public void display() {
        System.out.println("こんにちは！けんです。");
    }
    
}