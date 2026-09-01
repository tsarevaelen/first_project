package test2.restaurant;

public class Main {//22.создаю мейн и сразу прописываю точку входа
    public static void main(String[] args){
        Dish fish = new HotDish("Запеченая рыба", 1500, 50);
        Dish water = new Drink("Вода без газа", 550, 300);
        Menu menu = new Menu();

        menu.printMenu(fish);
        menu.printMenu(water);
    }
}
