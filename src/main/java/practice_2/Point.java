package practice_2;

public class Point {
    public static void main(String[] args){
        Point a = new Point(14.234, 11.123);
        System.out.println("Долгота: " + a.x + ", широта: " + a.y);

        a.getX();
        System.out.println(a.x);

        a.getY();
        System.out.println(a.y);

        a.setX(14.567);
        System.out.println(a.x);

        a.print();
        a.x = 15.123;
        a.print();

    }

    double x;
    double y;

    Point(double someX, double someY){
        this.x = someX;
        this.y = someY;
    }

    public double getX(){
        return this.x;
    }
    public double getY(){
        return this.y;
    }

    void setX(double newX){
        this.x = newX;
    }

    void print(){
        System.out.println("Долгота: " + this.x + ", широта: " + this.y);
    }



}
