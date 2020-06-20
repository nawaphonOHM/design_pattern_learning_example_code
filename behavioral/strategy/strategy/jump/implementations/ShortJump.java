package behavioral.strategy.strategy.jump.implementations;

import behavioral.strategy.strategy.jump.JumpBehavior;

public class ShortJump implements JumpBehavior{

    @Override
    public void jump() {
        System.out.println("Short Jump");
    }
    
}