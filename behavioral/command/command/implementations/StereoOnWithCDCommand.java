package behavioral.command.command.implementations;

import behavioral.command.command.Command;
import behavioral.command.receiver.Stereo;

public class StereoOnWithCDCommand implements Command {
    final private Stereo stereo;
    
    public StereoOnWithCDCommand(Stereo stereo){
        this.stereo = stereo;
    }
    
    @Override
    public void execute() {
        stereo.on();
        stereo.setCD();
        stereo.setVolume(11);
    }
    
}