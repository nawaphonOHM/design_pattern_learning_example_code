package behavioral.state.context;

import behavioral.state.state.MobileAlert;
import behavioral.state.state.concrete_states.Vibration;

public class Alert {
    private MobileAlert state;

    public Alert(){
        this.state = new Vibration();
    }

    public void setState(MobileAlert state){
        this.state = state;
    }

    public void alert(){
        this.state.alert(this);
    }
}