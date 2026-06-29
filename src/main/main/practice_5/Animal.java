package practice_5;

public abstract class Animal {//1. создание нового класса с приватными полями
    private String movement;
    private String sounds;

    public String getMovement() {// 2. создает геттеры для внутреннего доступа и далее создаем наследников
        return this.movement;
    }

    public String getSounds() {
        return sounds;
    }

    abstract void makesounds();//5.создаем абстрактный методы.
    // после этого во всех наследниках появятся ошибки
    // - имплемент метод
    abstract void move();//5. тоже самое делаем с другим методом


}






