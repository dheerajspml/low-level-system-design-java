package homeremote.appliances;

public class Stereo {
    String name;
    public Stereo(String name) {
        this.name = name;
    }
   public void off() {
        System.out.println("stereo off");
    }
   public void on() {
        System.out.println("stereo on");
    }
   public void setCD() {
        System.out.println("stereo setCD");
    }
   public void setVolume(int level){
        System.out.println("stereo setVolume is set to " + level);
    }

}
