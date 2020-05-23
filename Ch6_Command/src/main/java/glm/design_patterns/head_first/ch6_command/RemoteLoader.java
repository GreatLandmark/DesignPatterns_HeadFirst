package glm.design_patterns.head_first.ch6_command;

/**
 * Hello world!
 *
 */
public class RemoteLoader {
    public static void main(String[] args) {
        RemoteControlWithUndo remoteControl = new RemoteControlWithUndo();
        Light livingRoomLight = new Light("Living room");
        LightOnCommand livingRoomLightOn = new LightOnCommand(livingRoomLight);
        LightOffCommand livingRoomLightOff = new LightOffCommand(livingRoomLight);

        remoteControl.setCommand(0, livingRoomLightOn, livingRoomLightOff);

        remoteControl.onButtoWasPushed(0);
        remoteControl.offButtoWasPushed(0);
        remoteControl.onButtoWasPushed(0);
        remoteControl.undoButtonWasPushed();
        remoteControl.undoButtonWasPushed();// 只能回退一步.

        CeilingFan ceilingFan = new CeilingFan("Living room");
        CeilingFanHighCommand ceilingFanHigh = new CeilingFanHighCommand(ceilingFan);
        CeilingFanMediumCommand ceilingFanMedium = new CeilingFanMediumCommand(ceilingFan);
        CeilingFanLowCommand ceilingFanLow = new CeilingFanLowCommand(ceilingFan);
        CeilingFanOffCommand ceilingFanOff = new CeilingFanOffCommand(ceilingFan);

        remoteControl.setCommand(1, ceilingFanHigh, ceilingFanOff);
        remoteControl.setCommand(2, ceilingFanMedium, ceilingFanOff);
        remoteControl.setCommand(3, ceilingFanLow, ceilingFanOff);

        remoteControl.onButtoWasPushed(1);
        remoteControl.offButtoWasPushed(1);
        remoteControl.onButtoWasPushed(1);
        remoteControl.undoButtonWasPushed();
        remoteControl.undoButtonWasPushed();// 只能回退一步.

        remoteControl.onButtoWasPushed(2);
        remoteControl.undoButtonWasPushed();
        remoteControl.offButtoWasPushed(3);
        remoteControl.onButtoWasPushed(1);
        remoteControl.undoButtonWasPushed();
    }
}
