package behavioral.command.command.implementations;

import behavioral.command.command.Command;
import behavioral.command.receiver.Light;

public class LightOnCommand implements Command {
    final private Light light;

    public LightOnCommand(Light light){
        this.light = light;
    }

    @Override
    public void execute() {
        light.on();
    }
    
}