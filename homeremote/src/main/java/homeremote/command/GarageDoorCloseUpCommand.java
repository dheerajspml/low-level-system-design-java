package homeremote.command;

import homeremote.appliances.GarageDoor;

public class GarageDoorCloseUpCommand  implements Command {
    GarageDoor garageDoor;
    public GarageDoorCloseUpCommand(GarageDoor garageDoor) {

        this.garageDoor = garageDoor;
    }
    @Override
    public void execute() {
        garageDoor.closeDoor();
    }
    @Override
    public void undo() {
        garageDoor.openDoor();
    }
}
