package practice_5.zoo;

public abstract class Animal {//1. создание нового класса с бстрактными методами полями
    abstract void makeSound();
    abstract void makeMove();


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





}






