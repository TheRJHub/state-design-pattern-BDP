public class YellowState implements TrafficLightState{
    @Override
    public void next(TrafficLight t){
        t.setState(new RedState());
    }
    @Override
    public void showSignal(){
        System.out.println("Yellow Light: wait");
    }
}