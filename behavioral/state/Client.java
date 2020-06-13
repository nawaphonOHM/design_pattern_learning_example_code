package behavioral.state;

import behavioral.state.context.Alert;
import behavioral.state.state.concrete_states.Silent;

public class Client {
    public static void main(String[] args){
        final Alert context = new Alert();

        context.alert();
        context.setState(new Silent());
        context.alert();
    }
}