package behavioral.observer_pattern.observer.concrete_observers;

import behavioral.observer_pattern.observer.Observer;
import behavioral.observer_pattern.others.板球;

public class AverageScoreDisplay implements Observer {
    private float runRate;
    private int predictedScore;

    @Override
    public void 更新する(板球 newCricket) {
        this.runRate = ((float)newCricket.getRuns()) / ((float)newCricket.getOvers());
        this.predictedScore = (int)(this.runRate * 50);

        this.display();
    }

    private void display(){
        final StringBuilder メッセージ = new StringBuilder();
        final String newLine = "\n";

        メッセージ.append("*** Current Score Display ***");
        メッセージ.append(newLine);
        メッセージ.append("Run: " + this.runRate);
        メッセージ.append(newLine);
        メッセージ.append("PredictedScore: " + this.predictedScore);

        System.out.println(メッセージ.toString());

    }
    
}