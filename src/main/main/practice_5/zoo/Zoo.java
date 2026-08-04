package practice_5.zoo;

public class Zoo {//8. создаем новый класс для управления

    private Animal animal;

    public void addAnimal(Animal animal){//9. создаем метод в котором добавляем животное
        this.animal = animal;
        System.out.println("Животное успешно добавлено в зоопарк");
    }

    public void forceMakeSound(){// 10. создаем доп метод
        //по распечатыванию вида и возраста животного
        this.animal.makeSound();
    }
}
