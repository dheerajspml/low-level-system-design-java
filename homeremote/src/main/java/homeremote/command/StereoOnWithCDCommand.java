package homeremote.command;

import homeremote.appliances.Stereo;

public class StereoOnWithCDCommand implements Command {
   Stereo stereo;
   public StereoOnWithCDCommand(Stereo stereo) {
       this.stereo = stereo;
   }
   @Override
   public void execute() {
         stereo.on();
         stereo.setCD();
         stereo.setVolume(4);
   }
   @Override
   public void undo() {
       stereo.setVolume(3);
   }
}
