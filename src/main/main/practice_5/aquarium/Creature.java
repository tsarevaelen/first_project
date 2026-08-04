package practice_5.aquarium;

public abstract class Creature {
    private String species;
    private String move;

    public Creature(String species, String move){
        this.species = species;
        this.move = move;
    };

    public String getSpecies() {
        return species;
    }

    public String getMove() {
        return move;
    }

abstract void demoBehaviour();

}
