package behavioral.strategy;

import behavioral.strategy.context.Fighter;
import behavioral.strategy.context.implementations.けん;
import behavioral.strategy.strategy.jump.JumpBehavior;
import behavioral.strategy.strategy.jump.implementations.LongJump;
import behavioral.strategy.strategy.jump.implementations.ShortJump;
import behavioral.strategy.strategy.kick.KickBehavior;
import behavioral.strategy.strategy.kick.implementations.TornadoKick;

public class Client {
    public static void main(String args[]){
        final JumpBehavior shortJump = new ShortJump();
        final JumpBehavior longJump = new LongJump();

        final KickBehavior tornadoKick = new TornadoKick();

        final Fighter ken = new けん(tornadoKick, shortJump);
        ken.display();

        ken.punch();
        ken.kick();
        ken.jump();

        ken.setJumpBehavior(longJump);
        ken.display();

        ken.punch();
        ken.kick();
        ken.jump();
    }
}