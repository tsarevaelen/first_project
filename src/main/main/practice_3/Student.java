package practice_3;

public class Student {
    public static void main (String[] args){

        System.out.println(Student.studendCount);
        Student petya = new Student(18, "Петя");
        System.out.println(Student.studendCount);

        Student kolya = new Student(19, "Коля");
        System.out.println(Student.studendCount);

        System.out.println(Student.MAX_YEAR);
        Student.printMaxYear();


    }

    int age;
    String name;

    final static int MAX_YEAR = 11;
    static int studendCount;

    static {
        studendCount = 0;
    }

    Student (int someAge, String someName){
        this.age = someAge;
        this.name = someName;
        studendCount++;
    }

    static void printMaxYear(){
        System.out.println(MAX_YEAR);
    }

    int getAge(){
        return this.age;
    }
}


