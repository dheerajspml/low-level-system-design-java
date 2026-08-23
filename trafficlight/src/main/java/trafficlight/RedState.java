package trafficlight;

public class RedState implements TrafficLightState {
    @Override
    public void action (TrafficLight signal) {
       signal.setCurrentState(new GreenState()); //next state
        System.out.println("RedState change to green");
    }
}
