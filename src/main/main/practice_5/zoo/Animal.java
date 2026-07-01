package practice_5.zoo;

public abstract class Animal {//1. создание нового класса с приватными полями
    private String species;
    private int age;

    public Animal(String species, int age){//11. создаю конструктор для передачи вида и возраста
        this.species = species;
        this.age = age;
    }

    public String getSpecies() {// 2. создает геттеры для внутреннего доступа и далее создаем наследников
        return this.species;
    }

    public int getAge() {
        return age;
    }

    abstract String makeSound();//5.создаем абстрактный методы.
    // после этого во всех наследниках появятся ошибки
    // - имплемент метод
    abstract String move();
    //5. тоже самое делаем с другим методом




}






