package practice_2;

public class Product {
    public static void main(String[] args){
        Product makarony = new Product("Барила", 100);
        System.out.println("Название: " + makarony.name + ", цена: " + makarony.price);


        makarony.setPrice(120);
        System.out.println(makarony.price);

        double new_price = makarony.applyDiscount(50, makarony.price);
        System.out.println("Новая цена: " + new_price);

        makarony.price = new_price;

        makarony.printinfo();


    }
    String name;
    double price;

    Product(String someName, double somePrice){
        this.name = someName;
        this.price = somePrice;
    }

    public String getName(){
        return this.name;
    }

    public double getPrice(){
        return this.price;
    }

    void setPrice(double newPrice){
        this.price = newPrice;
    }

    public double applyDiscount(double discount, double price){
        return (double) price - (price * discount / 100);
    }

    void printinfo(){
        System.out.println("Название: " + this.name + ", цена: " + this.price);
    }
}
