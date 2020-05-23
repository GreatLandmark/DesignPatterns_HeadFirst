package glm.design_patterns.head_first.ch6_command;

public class CeilingFanMediumCommand implements Command {
    CeilingFan ceilingFan;
    int preSpeed;

    public CeilingFanMediumCommand(CeilingFan ceilingFan) {
        this.ceilingFan = ceilingFan;
        preSpeed = 0;
    }

    public void execute() {
        preSpeed = ceilingFan.getSpeed();
        ceilingFan.medium();
    }

    public void undo() {
        switch (preSpeed) {
            case CeilingFan.HIGH:
                ceilingFan.high();
                break;
            case CeilingFan.MEDIUM:
                ceilingFan.medium();
                break;
            case CeilingFan.LOW:
                ceilingFan.low();
                break;
            case CeilingFan.OFF:
                ceilingFan.off();
        }
    }
}