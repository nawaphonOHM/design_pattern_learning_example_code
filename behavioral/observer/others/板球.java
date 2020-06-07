package behavioral.observer.others;

import java.util.Random;

public class 板球 {
    int runs;
    int wickets;
    long overs;

    final Random ran;

    public 板球(){
        this.ran = new Random();

        this.ran.setSeed(90);
        this.runs = this.ran.nextInt();

        this.ran.setSeed(2);
        this.wickets = this.ran.nextInt();

        this.ran.setSeed((long)10.2);
        this.overs = this.ran.nextLong();
    }

    public int getRuns(){
        return this.runs;
    }

    public void setRuns(int runs){
        this.runs = runs;
    }

    public void setWickets(int wickets){
        this.wickets = wickets;
    }

    public int getWickets(){
        return this.wickets;
    }

    public void setOvers(long overs){
        this.overs = overs;
    }

    public long getOvers(){
        return this.overs;
    }

    public void updatesGame(){
        this.updatesOvers();
        this.updatesRuns();
        this.updatesWickets();
    }

    private void updatesRuns(){
        this.ran.setSeed(this.runs);
        this.runs = this.ran.nextInt();
    }

    private void updatesWickets(){
        this.ran.setSeed(this.wickets);
        this.wickets = this.ran.nextInt();
    }

    private void updatesOvers(){
        this.ran.setSeed(this.overs);
        this.overs = this.ran.nextLong();
    }
}