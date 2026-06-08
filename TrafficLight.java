public class TrafficLight{
    private TrafficLightState state;
    public TrafficLight(){
        state=new RedState();// we can set any state
    }
    public void setState(TrafficLightState state){
        this.state=state;
    }
    public void change(){
        state.next(this);
    }
    public void showSignal(){
        state.showSignal();
    }
}