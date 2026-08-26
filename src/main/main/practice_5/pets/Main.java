package practice_5.pets;

public class Main {
    public static void main(String[] args){
        PetManager petManager = new PetManager();

        Pet dog = new Dog();
        petManager.addPet(dog);
        petManager.forceMakeEat();
        petManager.forceMakeMove();
        petManager.deathPet();

        Pet cat = new Cat();
        petManager.addPet(cat);
        petManager.forceMakeEat();
        petManager.forceMakeMove();
        petManager.deathPet();
    }
}
