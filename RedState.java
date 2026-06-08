public class RedState implements TrafficLightState {
    @Override
    public void next(TrafficLight light) {
        light.setState(new GreenState());
    }

    @Override
    public void showSignal() {
        System.out.println("RED Light - STOP");
    }
}
