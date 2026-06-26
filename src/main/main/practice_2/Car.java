package practice_2;
public class Car {
    public static void main(String[] args){
        Car lada = new Car("Волга", 1980);
        System.out.println("Бренд:" + lada.brand);
        System.out.println("Год:" + lada.year);

        lada.setBrand("Жигули");
        lada.print();

        lada.setYear(2000);
        lada.print();


    }
    String brand;
    int year;

    Car(String someBrand, int someYear){
        this.brand = someBrand;
        this.year = someYear;
    }

    public String getBrand(){
        return this.brand;
    }
    public int getYear(){
        return this.year;
    }

    void print(){
        System.out.println("Бренд: " + this.brand + ", Год выпуска:" + this.year );
    }

    void setBrand(String newBrand){
        this.brand = newBrand;
    }
    void setYear(int newYear){
        this.year = newYear;
    }

}
