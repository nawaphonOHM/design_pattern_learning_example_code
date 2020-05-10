package behavioral.command.concrete_command;

import behavioral.command.command.Command;
import behavioral.command.receiver.Stereo;

public class StereoOffCommand implements Command {
    final private Stereo stereo;

    public StereoOffCommand(Stereo stereo){
        this.stereo = stereo;
    }

    @Override
    public void execute() {
        stereo.off();
    }
    
}