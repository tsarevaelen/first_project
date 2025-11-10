//1. Напишите класс MathOperations
//Условие:
//Создайте класс MathOperations с методами:
//add(int x, int y) — возвращает сумму двух чисел
//subtract(int x, int y) — разницу
//multiply(int x, int y) — произведение
//divide(int x, int y) — результат деления в double
//В main вызовите каждый метод с произвольными числами и выведите результат.
//
public class MathOperations {
//    public static void main(String[] args) {
//        int x = 3;
//        int y = 2;
//        int sum1 = sum(x, y);
//        System.out.println("Сумма двух чисел = " + sum1);
//
//        int a = 10;
//        int b = 2;
//        int sub = subtract(a, b);
//        System.out.println("Разница двух чисел = " + sub);
//
//        int c = 2;
//        int d = 3;
//        int mult = multiply(c, d);
//        System.out.println("Произведение двух чисел = " + mult);
//
//        int e = 10;
//        int f = 3;
//        double div = divide(e, f);
//        System.out.println("Деление двух чисел = " + div);
//
//
//    }
//
//    public static int sum(int x, int y) {
//        return x + y;
//    }
//
//    public static int subtract(int a, int b) {
//        return a - b;
//    }
//
//    public static int multiply(int c, int d) {
//        return c * d;
//    }
//
//    public static double divide(int e, int f) {
//        return (double) e / f;
//    }

//2. Реализуйте метод для нахождения максимума двух чисел
//Условие:
//Создайте метод findMax(int a, int b), который возвращает большее из двух чисел.
//Вызовите метод в main и выведите результат.
//
//public static void main(String[] args){
//    int a = 23;
//    int b = 19;
//    int max = Math.max(a,b);
//    System.out.println("Большее число: " + max);
//}

//3. Метод для нахождения разницы между двумя числами
//Условие:
//Создайте метод difference(int x, int y), который возвращает модуль разности двух чисел.
//Проверьте метод в main.
//
//public static void main(String[] args) {
//    int x = 12;
//    int y = 8;
//    int diff = Math.abs(x-y);
//    System.out.println("Разница двух чисел = " + diff);
//}

    //        4. Методы для площади и периметра квадрата
//Условие:
//Создайте два метода:
//squareArea(int side) — возвращает площадь квадрата
//squarePerimeter(int side) — возвращает периметр
//Вызовите оба метода в main с примером.
//
    public static void main(String[] args) {
//    int side = 2;
//    int area = squareArea(side);
//    System.out.println("Площадь квадрата = " + area);
//
//    int Perimeter = squarePerimeter(side);
//    System.out.println("Периметр квадрата = " + Perimeter);
//}
//
//public static int squareArea(int side){
//    return side * side;
//}
//public static int squarePerimeter(int side){
//    return side * 4;
//}

//5. Метод для перевода секунд в минуты
//Условие:
//Создайте метод convertSecondsToMinutes(int seconds),
// который возвращает количество минут (целых или дробных).
//Вызовите метод в main и выведите результат.
//\
//    int seconds = 120;
//    int min = convertSecondsToMinutes(seconds);
//    System.out.println("Количество минут: " + min);
//}
//
//public static int convertSecondsToMinutes(int seconds){
//    return seconds / 60;
//}
//}
//6. Метод для вычисления средней скорости
//Условие:
//Создайте метод averageSpeed(double distance, double time),
// который возвращает среднюю скорость (distance / time).
//Вызовите метод с разными значениями.
//
//      double distance = 30;
//      double time = 5;
//      double V = averageSpeed(distance, time);
//      System.out.println("Средняя скорость = " + V);
//    }
//    public static double averageSpeed(double distance, double time){
//        return (double) distance / time;
//    }
//}
//7. Метод для нахождения гипотенузы
//Условие:
//Создайте метод findHypotenuse(double a, double b) для вычисления гипотенузы
// по теореме Пифагора:
//        √(a² + b²)
//Вызовите метод с несколькими наборами чисел.
//
//        double a = 6;
//        double b = 4;
//        double H = Math.sqrt(a * a + b * b);
//        System.out.println("Гипотенуза = " + H);
//
//        double x = 10;
//        double y = 7;
//        double H1 = Math.sqrt(x * x + y * y);
//        System.out.println("Гипотенуза = " + H1);
//    }
//}
//        8. Метод для длины окружности
//Условие:
//Создайте метод circleCircumference(double radius), который возвращает длину окружности по формуле 2πr.
//Проверьте работу на нескольких значениях.
//
//        double radius = 3;
//        double Circumference = 2 * Math.PI * radius;
//        System.out.println("Длина окружности = " + Circumference);
//    }
//}
//9. Метод для вычисления процентов
//Условие:
//Создайте метод calculatePercentage(double total, double part) —
// возвращает, какой процент от общего составляет часть.
//Пример: 25 из 200 → 12.5%
//
//        double total = 100;
//        double part = 15;
//        double Percentage = calculatePercentage(total, part);
//        System.out.println("процент от общего составляет: " + Percentage);
//    }
//    public static double calculatePercentage(double total, double part){
//        return (double) (part / total) * 100;
//    }
//}
//        10. Методы перевода температуры
//Условие:
//Создайте два метода:
//celsiusToFahrenheit(double c) — перевод в Фаренгейты: C × 9 / 5 + 32
//fahrenheitToCelsius(double f) — перевод в Цельсий: (F − 32) × 5 / 9
//Проверьте оба метода в main.
        double c = 20;
        double f = celsiusToFahrenheit(c);
        System.out.println("перевод в Фаренгейты: " + f);

        double f1 = 68;

        double c1 = fahrenheitToCelsius(f);
        System.out.println("перевод в Цельсий: " + c1);
    }
    public static double celsiusToFahrenheit(double c){
        return c * 9 / 5 + 32;
    }
    public static double fahrenheitToCelsius(double f){
        return (f - 32) * 5 / 9;
    }
}