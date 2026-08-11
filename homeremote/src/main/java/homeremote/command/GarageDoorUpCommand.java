package homeremote.command;

import homeremote.appliances.GarageDoor;

public class GarageDoorUpCommand implements Command {
    GarageDoor garageDoor;
    public GarageDoorUpCommand(GarageDoor garageDoor) {
        this.garageDoor = garageDoor;
    }

    @Override
    public void execute() {
        garageDoor.openDoor();
    }
    @Override
    public void undo() {
        garageDoor.closeDoor();
    }
}
