package practice_2;

public class Circle {
    public static void main(String[] args){
        Circle o = new Circle(3);
        System.out.println("Радиус = " + o.radius);

        o.getRadius();
        System.out.println(o.radius);

        o.setRadius(4);
        System.out.println(o.radius);

        double area = calculateArea(o.radius);
        System.out.println("Площадь круга = " + area);

        double Circumference = calculateCircumference(o.radius);
        System.out.println("Окружность круга = " + Circumference);
    }

    double radius;

    Circle(double someRadius){
        this.radius = someRadius;
    }

    public double getRadius(){
        return this.radius;
    }

    void setRadius(double newRadius){
        this.radius = newRadius;
    }

    public static double calculateArea(double radius){
        return Math.PI * radius * radius;
    }

    public static double calculateCircumference(double radius){
        return 2 * Math.PI * radius;
    }
}
