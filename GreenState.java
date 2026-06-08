public class GreenState implements TrafficLightState {
    @Override
    public void next(TrafficLight light) {
        light.setState(new YellowState());
    }

    @Override
    public void showSignal() {
        System.out.println("GREEN Light - GO");
    }
}
