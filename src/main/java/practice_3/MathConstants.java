package practice_3;

public class MathConstants {
    public static void main(String[] args){
        double CircleArea = calculateCircleArea(MathConstants.r);
        System.out.println("Площадь круга: " + CircleArea);

        double Circumference = calculateCircumference(MathConstants.r);
        System.out.println("Длина окружности: " + Circumference);


        double CircleArea1 = calculateCircleArea(MathConstants.r1);
        System.out.println("Площадь круга: " + CircleArea1);

        double Circumference1 = calculateCircumference(MathConstants.r1);
        System.out.println("Длина окружности: " + Circumference1);

    }
    static final double PI = 3.14159;
    static final double E = 2.71828;
    static double r = 2;
    static double r1 = 3;



    public static double calculateCircleArea(double r){
        return (double) PI * r * r;
    }

    public static double calculateCircumference(double r){
        return (double) PI * 2 * r;
    }

}
