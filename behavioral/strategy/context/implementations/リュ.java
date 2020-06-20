package behavioral.strategy.context.implementations;

import behavioral.strategy.context.Fighter;
import behavioral.strategy.strategy.jump.JumpBehavior;
import behavioral.strategy.strategy.kick.KickBehavior;

public class リュ extends Fighter {

    public リュ(KickBehavior kickBehavior, JumpBehavior jumpBehavior) {
        super(kickBehavior, jumpBehavior);
    }

    @Override
    public void display() {
        System.out.println("こんにちは！リュです。");
    }
}