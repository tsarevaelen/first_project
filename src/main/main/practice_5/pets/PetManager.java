package practice_5.pets;

public class PetManager {
    private Pet pet;

    public void addPet(Pet pet) {
        this.pet = pet;
        System.out.println("Животное " + pet + " появилось у хозяина");
    }

    public void forceMakeEat() {
        this.pet.makeEat();
    }

    public void forceMakeMove(){
        this.pet.makeMove();
    }

    public void deathPet(){
        System.out.println("Питомец " + pet + " скончался");
        this.pet = null;
    }
}
