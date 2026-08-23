package trafficlight;

public class YellowState implements TrafficLightState {
    @Override
    public void action (TrafficLight signal) {
     signal.setCurrentState(new RedState());
     System.out.println("changed to red");
    }
}
