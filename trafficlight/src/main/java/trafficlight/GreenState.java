package trafficlight;

public class GreenState implements TrafficLightState {
    @Override
    public void action (TrafficLight signal) {
        signal.setCurrentState(new YellowState());
        System.out.println("changed to yellow");
    }
}
