package glm.design_patterns.head_first.ch6_command;

public class RemoteControlWithUndo {
    private Command[] onCommands;
    private Command[] offCommands;
    private Command undoCommand;

    public RemoteControlWithUndo(){
        onCommands=new Command[7];
        offCommands=new Command[7];

        Command noCommand=new NoCommand();
        for(int i=0;i<7;i++){
            onCommands[i]=noCommand;
            offCommands[i]=noCommand;
        }
        undoCommand=noCommand;
    }

    public void setCommand(int slot,Command onCommand,Command offCommand){
        onCommands[slot]=onCommand;
        offCommands[slot]=offCommand;
    }
    public void onButtoWasPushed(int slot){
        onCommands[slot].execute();
        undoCommand=onCommands[slot];
    }
    public void offButtoWasPushed(int slot){
        offCommands[slot].execute();
        undoCommand=offCommands[slot];
    }
    public void undoButtonWasPushed(){
        undoCommand.undo();
    } 

}