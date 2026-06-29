package practice_5;

public abstract class Animal {//1. создание нового класса с приватными полями
    private String species;
    private int age;

    public String getSpecies() {// 2. создает геттеры для внутреннего доступа и далее создаем наследников
        return this.species;
    }

    public int getAge() {
        return this.age;
    }

    abstract void add();


}






