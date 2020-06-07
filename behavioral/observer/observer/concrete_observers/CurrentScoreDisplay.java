package behavioral.observer.observer.concrete_observers;

import behavioral.observer.observer.Observer;
import behavioral.observer.others.板球;

public class CurrentScoreDisplay implements Observer {

    板球 cricket;

    @Override
    public void 更新する(板球 newCricket) {
        this.cricket = newCricket;

        this.display();
    }

    private void display(){
        final StringBuilder メッセージ = new StringBuilder();
        final String newLine = "\n";

        メッセージ.append("*** Current Score Display ***");
        メッセージ.append(newLine);
        メッセージ.append("Runs: " + this.cricket.getRuns());
        メッセージ.append(newLine);
        メッセージ.append("Wickets: " + this.cricket.getWickets());
        メッセージ.append(newLine);
        メッセージ.append("Overs: " + this.cricket.getOvers());

        System.out.println(メッセージ.toString());

    }
    
}