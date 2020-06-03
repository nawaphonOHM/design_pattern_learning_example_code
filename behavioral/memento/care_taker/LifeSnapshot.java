package behavioral.memento.care_taker;

import java.util.Stack;

import behavioral.memento.memento.Memento;

public class LifeSnapshot {
    final Stack<Memento> snapshot;

    public LifeSnapshot(){
        this.snapshot = new Stack<Memento>();
    }

    public Memento getLastSave(){
        return this.snapshot.pop();
    }

    public void save(Memento memory){
        this.snapshot.push(memory);
    }

    public Memento getFirstMoment(){
        return this.snapshot.firstElement();
    }
}