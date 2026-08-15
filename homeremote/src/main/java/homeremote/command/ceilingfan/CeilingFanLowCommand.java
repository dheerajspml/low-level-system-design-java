package homeremote.command.ceilingfan;

import homeremote.appliances.CeilingFan;
import homeremote.command.Command;

public class CeilingFanLowCommand implements Command {
    CeilingFan ceilingFan;
    int prevSpeed;
    public CeilingFanLowCommand(CeilingFan ceilingFan) {
        this.ceilingFan = ceilingFan;
    }
    @Override
    public void execute() {
        prevSpeed = ceilingFan.getSpeed();
        ceilingFan.low();
    }

    @Override
    public void undo() {
        if(prevSpeed == CeilingFan.MEDIUM){
            ceilingFan.medium();
        }else if(prevSpeed == CeilingFan.OFF){
            ceilingFan.off();
        } else if (prevSpeed == CeilingFan.HIGH) {
            ceilingFan.high();
        } else if (prevSpeed == CeilingFan.LOW) {
            ceilingFan.low();
        }

    }
}
