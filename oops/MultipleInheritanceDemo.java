package oops;

interface Printable {
    void printDetails(); // not define this method in interface 
}

class SavingsAccountX implements Printable {
    String name = "Harshit";
    double balance = 50000;

    public void printDetails() {
        System.out.println(name + " | Balance: " + balance);
    }
}

class CurrentAccountX implements Printable {
    String name = "Rohit";
    double balance = 20000;

    public void printDetails() {
        System.out.println(name + " | Balance: " + balance);
    }
}

public class MultipleInheritanceDemo {
    public static void main(String[] args) {
        Printable p1 = new SavingsAccountX();
        p1.printDetails();

        Printable p2 = new CurrentAccountX();
        p2.printDetails();
    }
}
