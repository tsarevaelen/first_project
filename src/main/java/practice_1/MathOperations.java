package practice_1;

public class MathOperations {
    public static void main(String[] args) {
        int x = 3;
        int y = 2;
        int sum1 = sum(x, y);
        System.out.println("Сумма двух чисел = " + sum1);

        int a = 10;
        int b = 2;
        int sub = subtract(a, b);
        System.out.println("Разница двух чисел = " + sub);

        int c = 2;
        int d = 3;
        int mult = multiply(c, d);
        System.out.println("Произведение двух чисел = " + mult);

        int e = 10;
        int f = 3;
        double div = divide(e, f);
        System.out.println("Деление двух чисел = " + div);

        int a1 = 10;
        int b1 = 12;
        System.out.println("Большее число: " + findMax(a1, b1));

        int x1 = 12;
        int y1 = 8;
        int diff = Math.abs(x1 - y1);
        System.out.println("Разница двух чисел = " + diff);

        int side = 2;
        int area = squareArea(side);
        System.out.println("Площадь квадрата = " + area);

        int Perimeter = squarePerimeter(side);
        System.out.println("Периметр квадрата = " + Perimeter);

        int seconds = 120;
        int min = convertSecondsToMinutes(seconds);
        System.out.println("Количество минут: " + min);

        double distance = 30;
        double time = 5;
        double V = averageSpeed(distance, time);
        System.out.println("Средняя скорость = " + V);

        double a2 = 6;
        double b2 = 4;
        double H = Math.sqrt(a2 * a2 + b2 * b2);
        System.out.println("Гипотенуза = " + H);

        double x2 = 10;
        double y2 = 7;
        double H1 = Math.sqrt(x2 * x2 + y2 * y2);
        System.out.println("Гипотенуза = " + H1);

        double radius = 3;
        double Circumference = 2 * Math.PI * radius;
        System.out.println("Длина окружности = " + Circumference);

        double total = 100;
        double part = 15;
        double Percentage = calculatePercentage(total, part);
        System.out.println("процент от общего составляет: " + Percentage);

        double c2 = 20;
        double f2 = celsiusToFahrenheit(c2);
        System.out.println("перевод в Фаренгейты: " + f2);

        double f3 = 68;

        double c3 = fahrenheitToCelsius(f3);
        System.out.println("перевод в Цельсий: " + c3);
    }



    public static int sum(int x, int y) {
        return x + y;
    }

    public static int subtract(int a, int b) {
        return a - b;
    }

    public static int multiply(int c, int d) {
        return c * d;
    }

    public static double divide(int e, int f) {
        return (double) e / f;
    }

    public static int findMax(int a1, int b1) {
        if (a1 > b1) {
            return a1;
        } else {
            return b1;
        }
    }

    public static int squareArea(int side) {
        return side * side;
    }

    public static int squarePerimeter(int side) {
        return side * 4;
    }

    public static int convertSecondsToMinutes(int seconds) {
        return seconds / 60;
    }

    public static double averageSpeed(double distance, double time) {
        return (double) distance / time;
    }
    public static double calculatePercentage(double total, double part){
    return (double) (part / total) * 100;
    }

    public static double celsiusToFahrenheit(double c2){
    return c2 * 9 / 5 + 32;
    }

    public static double fahrenheitToCelsius(double f3){
    return (f3 - 32) * 5 / 9;
    }
}
