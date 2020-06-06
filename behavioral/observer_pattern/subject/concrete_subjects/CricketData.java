package behavioral.observer_pattern.subject.concrete_subjects;

import java.util.ArrayList;
import java.util.List;

import behavioral.observer_pattern.observer.Observer;
import behavioral.observer_pattern.others.板球;
import behavioral.observer_pattern.subject.Subject;

public class CricketData implements Subject {
    final 板球 cricket;
    final List<Observer> subscribers;

    public CricketData(){
        this.cricket = new 板球();
        this.subscribers = new ArrayList<Observer>();
    }

    @Override
    public void attach(Observer observer) {
        this.subscribers.add(observer);
    }

    @Override
    public void detach(Observer observer) {
        this.subscribers.remove(observer);
    }

    @Override
    public void แจ้งข่าว() {
        
        for(Observer subscriber : this.subscribers){
            subscriber.更新する(cricket);
        }
    }

    public void dataChange(){
        this.cricket.updatesGame();

        this.แจ้งข่าว();
    }
    
}