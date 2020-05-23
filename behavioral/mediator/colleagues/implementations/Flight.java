package behavioral.mediator.colleagues.implementations;

import behavioral.mediator.colleagues.Command;
import behavioral.mediator.mediators.InternationalAirTrafficControlMediator;

public class Flight implements Command {
    final private InternationalAirTrafficControlMediator atcMediator;

    public Flight(InternationalAirTrafficControlMediator atcMediator){
        this.atcMediator = atcMediator;
    }

    @Override
    public void land() {
        if(this.atcMediator.isLandingOk()){
            System.out.println("Successfully Landed.");
        } else {
            System.out.println("Waiting for landing.");
        }

    }

    public void getReady(){
        System.out.println("Ready for landing.");
    }
    
}