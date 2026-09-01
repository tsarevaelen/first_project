package test2.restaurant;

public class Dish implements Printable {//1. создала новый неабстрактный класс
    //15. добавляю implements Printable, чтобы заставить работать с интерфейсом и возникает ошибка
    //16. после ошибки - нажать имплементировать метод принт
    private String name;//2.сразу добавляю приватные ОБЩИЕ поля
    private int price;

    public Dish() {
    }

    public String getName() {//3. генерирую геттеры для всех полей
        return name;
    }

    public int getPrice() {
        return price;
    }

    public Dish(String name, int price) {//4. генерирую конструктор
        this.name = name;
        this.price = price;
    }

    @Override
    public void print() {//17. автоматически появилась конструкция после имплементации метода
        System.out.println("Блюдо: " + this.name + ", цена: " + this.price);//18. прописываем то
        //что надо распечатать и перехожим к горячим блюдам и напиткам

    }
}

