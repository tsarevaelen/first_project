package practice_5.pets;

public class Main {
    public static void main(String[] args){
        Pet dog = new Dog();
        Pet cat = new Cat();

        PetManager petManager = new PetManager();
        petManager.handlePet(cat);
    }
}
