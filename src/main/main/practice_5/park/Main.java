package practice_5.park;

public class Main {
    public static void main(String[] args){
        SystemPark systemPark = new SystemPark();

        Attraction rollerCoaster = new RollerCoaster();
        Attraction carousel = new Carousel();

        systemPark.addAttraction(rollerCoaster);
        systemPark.forceService();
        systemPark.showSensations();
        systemPark.addAttraction(carousel);
        systemPark.forceService();
        systemPark.showSensations();
    }
}
