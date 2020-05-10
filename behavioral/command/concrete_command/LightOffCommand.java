package behavioral.command.concrete_command;

import behavioral.command.command.Command;
import behavioral.command.receiver.Light;

public class LightOffCommand implements Command {
    final private Light light;

    public LightOffCommand(Light light){
        this.light = light;
    }

    @Override
    public void execute() {
        light.off();
    }
    
}