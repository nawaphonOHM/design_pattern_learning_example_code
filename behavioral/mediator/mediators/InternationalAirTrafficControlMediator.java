package behavioral.mediator.mediators;

import behavioral.mediator.colleagues.implementations.Flight;
import behavioral.mediator.colleagues.implementations.Runway;

public interface InternationalAirTrafficControlMediator {
    public void registerRunway(Runway runway);
    public void registerFlight(Flight flight);
    public boolean isLandingOk();
    public void setLandingStatus(boolean status);
}