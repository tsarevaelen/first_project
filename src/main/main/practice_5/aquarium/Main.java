package practice_5.aquarium;

public class Main {
    public static void main(String[] args){
        SystemAquarium systemAquarium = new SystemAquarium();
        Shark shark = new Shark();

        systemAquarium.addCreature(shark);
        systemAquarium.forceCreatureToSwim();
        systemAquarium.deleteCreature();

        Starfish starfish = new Starfish();
        systemAquarium.addCreature(starfish);
        systemAquarium.forceCreatureToSwim();
        systemAquarium.forceCreatureToCrawl();
    }
}
