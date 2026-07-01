package practice_5.pets;

public abstract class Pet {//1. создаю новый абстрактный класс
    private String name;// 2. сразу добавляю приватные поля
    private int age;


    public String getName(){//3. реализую геттеры для внутреннего доступа
        // (теперь есть доступ к чтению,без изменений)
        return name;
    }

    public int getAge() {
        return age;
    }

    abstract void feed();// 6. создаю абстрактные методы
    abstract void interact();

}
