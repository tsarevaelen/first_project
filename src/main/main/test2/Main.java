package test2;

public class Main {
    public void main(String[] args){//24. создаем мейт и сразу точку входа в программу
        Item mag = new Item("Кружка", 100, 2);
        Item microphone = new Electronics("Микрофон", 10000, 1);
        Item dress = new Clothes("Платье", 5000, 3);

        Manager kostya = new Manager();
        kostya.manage(mag);
        kostya.manage(microphone);
        kostya.manage(dress);


    }
}
