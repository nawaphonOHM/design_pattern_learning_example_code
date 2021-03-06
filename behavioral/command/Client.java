package behavioral.command;

import behavioral.command.command.implementations.LightOffCommand;
import behavioral.command.command.implementations.LightOnCommand;
import behavioral.command.command.implementations.StereoOffCommand;
import behavioral.command.command.implementations.StereoOnWithCDCommand;
import behavioral.command.invoker.SimpleRemoteControl;
import behavioral.command.receiver.Light;
import behavioral.command.receiver.Stereo;

public class Client {
    public static void main(String[] args){
        final SimpleRemoteControl remote = new SimpleRemoteControl();
        final Light light = new Light();
        final Stereo stereo = new Stereo();

        remote.setCommand(new LightOnCommand(light));
        remote.buttonWasPressed();

        remote.setCommand(new StereoOnWithCDCommand(stereo));
        remote.buttonWasPressed();

        remote.setCommand(new StereoOffCommand(stereo));
        remote.buttonWasPressed();

        remote.setCommand(new LightOffCommand(light));
        remote.buttonWasPressed();
    }
}