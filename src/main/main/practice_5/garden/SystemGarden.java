package practice_5.garden;

public class SystemGarden {
    private Plant plant;

    public void addPlant(Plant plant){
        this.plant = plant;
        System.out.println("Растение: " + plant + " добавлено в ботанический сад");
    }

    public void makeCake(){
        this.plant.care();
    }

    public void removePlant(){
        System.out.println("Растение: " + plant + " удалено из ботанического сада");
        this.plant = null;
    }

}
