package practice_2;

public class Laptop {
    public static void main(String[] args){
        Laptop extra = new Laptop("lenovo", 80000);
        System.out.println("Название бренда: " + extra.brand + ", цена: " + extra.price);

        extra.setBrand("Леново");
        System.out.println(extra.brand);

        extra.setPrice(100000);
        System.out.println(extra.price);

        extra.printInfo();
    }

    String brand;
    double price;

    Laptop(String someBrand, double somePrice){
        this.brand = someBrand;
        this.price = somePrice;
    }

    public String getBrand(){
        return this.brand;
    }
    public double getPrice(){
        return this.price;
    }

    void setBrand(String newBrand){
        this.brand = newBrand;
    }

    void setPrice(double newPrice){
        this.price = newPrice;
    }

    void printInfo(){
        System.out.println("Название бренда: " + this.brand + ", цена: " + this.price);
    }


}
