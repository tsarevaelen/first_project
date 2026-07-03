package practice_5.pets;

public abstract class Pet {//1. создаю новый абстрактный класс
    private String feed;// 2. сразу добавляю приватные поля
    private String interact;

    public Pet (String feed, String interact){
        this.feed = feed;
        this.interact = interact;
    }


    public String getFeed(){//3. реализую геттеры для внутреннего доступа
        // (теперь есть доступ к чтению,без изменений)
        return feed;
    }

    public String getInteract() {
        return interact;
    }

    abstract void feed();// 6. создаю абстрактные методы
    abstract void interact();

}
