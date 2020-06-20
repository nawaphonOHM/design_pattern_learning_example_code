package behavioral.strategy.context;

import behavioral.strategy.strategy.jump.JumpBehavior;
import behavioral.strategy.strategy.kick.KickBehavior;

public abstract class Fighter {
    private KickBehavior kickBehavior;
    private JumpBehavior jumpBehavior;

    public Fighter(KickBehavior kickBehavior, JumpBehavior jumpBehavior) {
        this.kickBehavior = kickBehavior;
        this.jumpBehavior = jumpBehavior;
    }
    public void punch(){
        System.out.println("Default Punch");
    }

    public void kick(){
        this.kickBehavior.kick();
    }

    public void jump(){
        this.jumpBehavior.jump();
    }

    public void roll(){
        System.out.println("Default Roll");
    }

    public void setKickBehavior(KickBehavior kickBehavior){
        this.kickBehavior = kickBehavior;
    }

    public void setJumpBehavior(JumpBehavior jumpBehavior){
        this.jumpBehavior = jumpBehavior;
    }

    public abstract void display();
}