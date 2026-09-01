package practice_5.restaurant;

public class Main {
    public static void main(String[] args){

        Menu menu = new Menu();

        HotDish meat = new HotDish(70);
        menu.addDish(meat);
        menu.showDiscription();

        Drink water = new Drink(250);
        menu.addDish(water);
        menu.showDiscription();
    }
}
