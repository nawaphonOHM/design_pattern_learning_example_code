package behavioral.command.invoker;

import behavioral.command.command.Command;

public class SimpleRemoteControl {
    Command slot;

    public SimpleRemoteControl(){

    }

    public void setCommand(Command command){
        this.slot = command;
    }

    public void buttonWasPressed(){
        this.slot.execute();
    }
}