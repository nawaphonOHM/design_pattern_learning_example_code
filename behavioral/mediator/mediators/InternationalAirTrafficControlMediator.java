package behavioral.mediator.mediators;

import behavioral.mediator.concrete_colleagues.Flight;
import behavioral.mediator.concrete_colleagues.Runway;

public interface InternationalAirTrafficControlMediator {
    public void registerRunway(Runway runway);
    public void registerFlight(Flight flight);
    public boolean isLandingOk();
    public void setLandingStatus(boolean status);
}