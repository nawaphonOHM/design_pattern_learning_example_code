package behavioral.strategy.strategy.jump.implementations;

import behavioral.strategy.strategy.jump.JumpBehavior;

public class LongJump implements JumpBehavior{

    @Override
    public void jump() {
        System.out.println("Long Jump");
    }
    
}