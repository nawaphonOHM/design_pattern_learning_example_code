package behavioral.mediator.concrete_colleagues;

import behavioral.mediator.colleagues.Command;
import behavioral.mediator.mediators.InternationalAirTrafficControlMediator;

public class Runway implements Command {
    final private InternationalAirTrafficControlMediator atcMediator;

    public Runway(InternationalAirTrafficControlMediator atcMediator){
        this.atcMediator = atcMediator;
        this.atcMediator.setLandingStatus(false);
    }

    @Override
    public void land() {
        System.out.println("Landing permission granted.");
        this.atcMediator.setLandingStatus(true);
    }
    
}