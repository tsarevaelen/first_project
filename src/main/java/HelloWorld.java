public class HelloWorld {
    static int a = 1;

    //метод
    //зеленая стреловка - код запускаемый
    //метод main - точка входа в программу
    public static void main(String[] args) {
int sum1 = sum(1,2);
        System.out.println("Результат сложения:" +sum1);

        int mult1 = multiply(2,3);
        System.out.println("Результат умножения:" + mult1);

        int sub1 = substruct(10,2);
        System.out.println("Результат вычетания:" + sub1);

        double div1 = divide(3,2);
        System.out.println("Результат деления:" + div1);
}
public static int sum(int x, int y){
    return x + y;
}

public static int multiply(int p, int k){
        int mult = p * k;
        return mult;
}

public static int substruct(int c, int d){
        int sub = c - d;
        return sub;
}

public static double divide(int e, int f){
return (double) e / f;
}
}