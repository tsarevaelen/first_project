package practice_5.farm;

public class Main {
    public static void main(String[] args){
        Farm farm = new Farm();

        Animal cow = new Cow();
        farm.addAnimal(cow);

        farm.implementNeed();
        farm.implementFunction();
        farm.removeAnimal();

        Animal chiken = new Chicken();
        farm.addAnimal(chiken);
        farm.implementNeed();
        farm.implementFunction();


    }
}
