package trafficlight;

public class TrafficLight {
    private TrafficLightState state;
    public TrafficLight() {
        this.state = new RedState(); //initial state
    }

    public  void setCurrentState(TrafficLightState state) {
        this.state = state;
    }

    public  void change(){
        state.action(this);

    }
}
