package practice_2;

public class Restangle {
    public static void main(String[] args){
        Restangle a = new Restangle(3, 2);
        a.print();

        a.getWidth();
        System.out.println(a.width);

        a.getHeight();
        System.out.println(a.height);

        a.setWidth(6);
        System.out.println(a.width);

        System.out.println("Площадь = " + a.calculateArea(a.width, a.height));
    }

    int width;
    int height;

    Restangle(int someWidth, int someHeight){
        this.width = someWidth;
        this.height = someHeight;
    }

    public int getWidth(){
        return this.width;
    }
    public int getHeight(){
        return this.height;
    }

    void setWidth(int newWidth){
        this.width = newWidth;
    }

    public int calculateArea(int width, int height){
        return width * height;
    }


    void print(){
        System.out.println("Ширина= " + this.width + ", высота = " + this.height);
    }
}
