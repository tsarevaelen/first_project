package practice_5.park;

public class SystemPark {
    private Attraction attraction;

    public void addAttraction(Attraction attraction){
        this.attraction = attraction;
        System.out.println("В парк добавлен атракцион: " + attraction);
    }
     public void forceService(){
        this.attraction.service();
     }
    public void showSensations(){
        this.attraction.sensations();
    }

}
