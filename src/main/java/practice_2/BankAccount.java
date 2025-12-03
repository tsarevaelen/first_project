package practice_2;

public class BankAccount {
    public static void main(String[] args) {
        BankAccount man = new BankAccount("Ivanov", 1000);
        System.out.println("Владелец счета: " + man.owner + ", баланс: " + man.balance);

        man.getOwner();
        System.out.println(man.owner);

        man.getBalance();
        System.out.println(man.balance);

        man.setOwner("Иванов");
        System.out.println(man.owner);

        double new_balance = man.deposit(man.balance);
        System.out.println("Новый баланс: " + new_balance);


       man.balance = new_balance;

       double post_balance = man.withdraw(new_balance);
       System.out.println("Новый баланс: " + post_balance);

        man.balance = post_balance;
        man.printBalance();

    }

    String owner;
    double balance;

    BankAccount(String someOwner, double someBalance) {
        this.owner = someOwner;
        this.balance = someBalance;
    }

    public String getOwner() {
        return this.owner;
    }

    public double getBalance() {
        return this.balance;
    }

    void setOwner(String newOwner) {
        this.owner = newOwner;
    }

    public static double deposit(double balance) {
        return balance + 500;
    }

    public  static  double withdraw(double new_balance){
        return new_balance - 250;
    }

    void printBalance(){
        System.out.println("Баланс: " + this.balance);
    }
}



