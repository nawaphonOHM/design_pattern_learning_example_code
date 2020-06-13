package behavioral.state.state.concrete_states;

import behavioral.state.context.Alert;
import behavioral.state.state.MobileAlert;

public class Vibration implements MobileAlert {

    @Override
    public void alert(Alert state) {
        System.out.println("vibration...");

    }
    
}