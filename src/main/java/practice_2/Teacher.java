package practice_2;

public class Teacher {
    public static void main(String[] args){
        Teacher man = new Teacher("Иванов", "Русский язык");
        System.out.println("Учитель: "+ man.name + ", предмет: " + man.subject);

        man.getName();
        System.out.println(man.name);

        man.getSubject();
        System.out.println(man.subject);

        man.setName("Иван Иванович Иванов");
        man.printInfo();

        man.setSubject("Литература");
        man.printInfo();

        man.subject = "Русский язык и литература";
        man.printInfo();

    }

    String name;
    String subject;

    Teacher(String someName, String someSubject){
        this.name = someName;
        this.subject = someSubject;
    }

    public String getName(){
        return this.name;
    }

    public  String getSubject(){
        return this.subject;
    }

    void setName(String newName){
        this.name = newName;
    }

    void setSubject(String newSubject){
        this.subject = newSubject;
    }

    void printInfo(){
        System.out.println("Учитель: "+ this.name + ", предмет: " + this.subject);
    }

}
