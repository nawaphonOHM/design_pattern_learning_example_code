package behavioral.mediator.mediators.implementations;

import behavioral.mediator.colleagues.implementations.Flight;
import behavioral.mediator.colleagues.implementations.Runway;
import behavioral.mediator.mediators.InternationalAirTrafficControlMediator;

public class AirTrafficControlMediator implements InternationalAirTrafficControlMediator{
    private Flight flight;
    private Runway runway;
    private boolean land;

    @Override
    public void registerRunway(Runway runway) {
        this.runway = runway;
    }

    @Override
    public void registerFlight(Flight flight) {
        this.flight = flight;
    }

    public boolean isLandingOk() {
        return this.land;
    }

    @Override
    public void setLandingStatus(boolean status) {
        this.land = status;
    }


}