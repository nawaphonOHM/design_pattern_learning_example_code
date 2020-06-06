package behavioral.observer_pattern.subject;

import behavioral.observer_pattern.observer.Observer;

public interface Subject {
    public void attach(Observer observer);
    public void detach(Observer observer);
    public void แจ้งข่าว();
}