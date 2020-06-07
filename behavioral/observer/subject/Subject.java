package behavioral.observer.subject;

import behavioral.observer.observer.Observer;

public interface Subject {
    public void attach(Observer observer);
    public void detach(Observer observer);
    public void แจ้งข่าว();
}