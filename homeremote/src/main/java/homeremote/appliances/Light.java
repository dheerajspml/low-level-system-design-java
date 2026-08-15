package homeremote.appliances;

public class Light {
    String name ;
    public Light(String livingRoom) {
        this.name = livingRoom;
    }

    public void on() {
        System.out.println(name +" Light on");
    }
   public void off() {
        System.out.println(name+" Light off");
    }
}
