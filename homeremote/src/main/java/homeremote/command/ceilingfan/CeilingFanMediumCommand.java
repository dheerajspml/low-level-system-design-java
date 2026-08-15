package homeremote.command.ceilingfan;

import homeremote.appliances.CeilingFan;
import homeremote.command.Command;

public class CeilingFanMediumCommand implements Command {
    CeilingFan ceilingFan;
    int prevSpeed;
    public CeilingFanMediumCommand(CeilingFan ceilingFan) {
        this.ceilingFan = ceilingFan;
    }

   @Override
    public void execute() {
        prevSpeed = ceilingFan.getSpeed();
        ceilingFan.medium();
   }
   @Override
    public void undo() {
        if (prevSpeed == CeilingFan.OFF) {
            ceilingFan.off();
        } else if(prevSpeed == CeilingFan.HIGH){
            ceilingFan.high();
        }else if(prevSpeed == CeilingFan.LOW){
            ceilingFan.low();
        } else if(prevSpeed == CeilingFan.MEDIUM){
            ceilingFan.medium();
        }
   }




}
