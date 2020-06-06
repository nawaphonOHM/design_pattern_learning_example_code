package behavioral.observer_pattern;

import java.util.Random;

import behavioral.observer_pattern.observer.concrete_observers.AverageScoreDisplay;
import behavioral.observer_pattern.observer.concrete_observers.CurrentScoreDisplay;
import behavioral.observer_pattern.subject.concrete_subjects.CricketData;

public class Client {
    public static void main(String args[]){
        final AverageScoreDisplay averageScoreDisplay = new AverageScoreDisplay();
        final CurrentScoreDisplay currentScoreDisplay = new CurrentScoreDisplay();

        final CricketData cricketData = new CricketData();

        final Random random = new Random();

        cricketData.attach(averageScoreDisplay);
        cricketData.attach(currentScoreDisplay);

        try{
            for(int counter = 0; counter < 32; counter++){
                Thread.sleep(random.nextInt(1000));
                cricketData.dataChange();
            }

        } catch(InterruptedException exception) {
            System.out.println("There was an interruption is " + exception.getMessage());
        }
    }
}