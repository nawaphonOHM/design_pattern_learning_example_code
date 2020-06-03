package behavioral.memento;

import behavioral.memento.care_taker.LifeSnapshot;
import behavioral.memento.originator.Life;

public class Client {
    
    public static void main(String[] args){
        final LifeSnapshot snapshotHub = new LifeSnapshot();
        final Life life = new Life();

        System.out.println("Hi! First time");
        snapshotHub.save(life.createMemento());

        System.out.println("Hi! Secound time");
        snapshotHub.save(life.createMemento());

        System.out.println("Hi! Third time");
        snapshotHub.save(life.createMemento());
    }
}