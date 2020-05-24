package behavioral.mediator;

import behavioral.mediator.colleagues.implementations.Flight;
import behavioral.mediator.colleagues.implementations.Runway;
import behavioral.mediator.mediators.InternationalAirTrafficControlMediator;
import behavioral.mediator.mediators.implementations.AirTrafficControlMediator;

public class Client {
    public static void main(String args[]){
        final InternationalAirTrafficControlMediator atcMediator = new AirTrafficControlMediator();

        final Flight spaarrow101 = new Flight(atcMediator);
        final Runway mainRunway = new Runway(atcMediator);

        atcMediator.registerFlight(spaarrow101);
        atcMediator.registerRunway(mainRunway);

        spaarrow101.getReady();

        mainRunway.land();
        
        spaarrow101.land();
    }
}