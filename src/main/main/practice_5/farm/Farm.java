package practice_5.farm;

public class Farm {
    private Animal animal;

    public void addAnimal(Animal animal){
        this.animal = animal;
        System.out.println("Животное " + animal + " добавлено на ферму");
    }

    public void implementNeed(){
        this.animal.need();
    }

    public void implementFunction(){
        this.animal.function();
    }

    public void removeAnimal(){
        System.out.println("Животное " + animal + " удалено с фермы");
        this.animal = null;
    }
}
