package homeremote.appliances;

public class GarageDoor {
    String name;
    public GarageDoor(String name) {
        this.name = name;
    }

    public  void openDoor() {
        System.out.println("Opening Door " + name);
    }
    public void closeDoor() {
        System.out.println("Closing Door " + name);
    }
}
