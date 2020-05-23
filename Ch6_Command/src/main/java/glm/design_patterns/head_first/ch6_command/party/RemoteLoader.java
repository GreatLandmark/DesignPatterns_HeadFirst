package glm.design_patterns.head_first.ch6_command.party;

import glm.design_patterns.head_first.ch6_command.*;

/**
 * Hello world!
 *
 */
public class RemoteLoader {
    public static void main(String[] args) {
        RemoteControlWithUndo remoteControl = new RemoteControlWithUndo();
        Light light = new Light("Living room");
        CeilingFan ceilingFan = new CeilingFan("Living room");

        LightOnCommand lightOn = new LightOnCommand(light);
        LightOffCommand lightOff = new LightOffCommand(light);

        CeilingFanHighCommand ceilingFanHigh = new CeilingFanHighCommand(ceilingFan);
        CeilingFanMediumCommand ceilingFanMedium = new CeilingFanMediumCommand(ceilingFan);
        CeilingFanLowCommand ceilingFanLow = new CeilingFanLowCommand(ceilingFan);
        CeilingFanOffCommand ceilingFanOff = new CeilingFanOffCommand(ceilingFan);

        Command[] partyOn={lightOn,ceilingFanMedium};
        Command[] partyOff={lightOff,ceilingFanOff};

        MacroCommand partyOnMacro=new MacroCommand(partyOn);
        MacroCommand partyOffMacro=new MacroCommand(partyOff);
        
        remoteControl.setCommand(6, partyOnMacro, partyOffMacro);

        remoteControl.onButtoWasPushed(6);
        remoteControl.offButtoWasPushed(6);
        remoteControl.undoButtonWasPushed();
        remoteControl.undoButtonWasPushed();
    }
}
