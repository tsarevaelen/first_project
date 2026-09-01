package practice_5.restaurant;

public class Menu {
    private Dish dish;

    public void addDish(Dish dish){
        this.dish = dish;
        System.out.println("Новое блюдо " + dish + "  добавлено в меню ");
    }

    public  void showDiscription(){
        this.dish.description();
    }
}
