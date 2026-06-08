public class Usage{
    public static void main(String[] args){
        TrafficLight t=new TrafficLight();
        for(int i=0;i<10;i++){
            t.showSignal();
            t.change();
            System.out.println("--------------------------");
        }

    }
}