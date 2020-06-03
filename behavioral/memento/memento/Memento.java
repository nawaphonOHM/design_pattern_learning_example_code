package behavioral.memento.memento;

public class Memento {
    private long time;

    public long getState(){
        return this.time;
    }

    public void setState(long currentTime){
        this.time = currentTime;
    }
}