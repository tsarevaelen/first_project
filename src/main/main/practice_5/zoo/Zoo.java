package practice_5.zoo;

public class Zoo {//8. создаем новый класс для управления

    private Animal currentAnimal;

    public void addAnimal(Animal animal){//9. создаем метод в котором добавляем животное
        this.currentAnimal = animal;
        System.out.println("Животное успешно добавлено в зоопарк");
    }

    public void demonstrateBehavior(){// 10. создаем доп метод
        //по распечатыванию вида и возраста животного
        currentAnimal.move();
        System.out.println("Животное " + currentAnimal.makeSound() + " животное  " + currentAnimal.move());
    }
}
