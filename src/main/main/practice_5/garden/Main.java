package practice_5.garden;

public class Main {
    public static void main(String[] args){
        SystemGarden systemGarden = new SystemGarden();
        Plant orchid = new Orchid();

        systemGarden.addPlant(orchid);
        systemGarden.makeCake();
        systemGarden.removePlant();

        Plant cactus = new Cactus();
        systemGarden.addPlant(cactus);
        systemGarden.makeCake();
    }
}
