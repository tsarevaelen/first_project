package practice_3;

public class Person {
    public static void main(String[] args){

        Person lena = new Person("Lena", "Tsareva", "123-123");
        lena.printPersonInfo();


        Person ilya = new Person("Ilya", "Tsarev", "456-456");
        ilya.printPersonInfo();

        System.out.println(lena.getFirstName());

        lena.setFirstName("Elena");
        lena.printPersonInfo();

        lena.setLastName("Царева");
        lena.printPersonInfo();


    }
    private String firstName;
    private String lastName;
    private final String ssn;

    Person(String someFirstName, String someLastName, String someSsn){
        this.firstName = someFirstName;
        this.lastName = someLastName;
        this.ssn = someSsn;
    }

    public String getFirstName(){
        return this.firstName;
    }

    public String getLastName(){
        return this.lastName;
    }

    public String getSsn(){
        return this.ssn;
    }

    void printPersonInfo(){
        System.out.println("Имя: " + this.firstName + ", фамилия: " + this.lastName + ", номер: " + this.ssn);
    }

    void setFirstName(String newFirstName){
        this.firstName = newFirstName;
    }

    void setLastName(String newLastName){
        this.lastName = newLastName;
    }
}
