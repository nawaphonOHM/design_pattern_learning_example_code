package behavioral.memento.originator;

import java.util.Date;

import behavioral.memento.memento.Memento;

public class Life {
    final private Date currentDate;

    public Life(){
        this.currentDate = new Date();
    }

    public void setMemento(Memento date){
        this.currentDate.setTime(date.getState());
    }

    public Memento createMemento(){
        final Memento mem = new Memento();

        mem.setState(currentDate.getTime());

        return mem;
    }
}