package oops;
public class SingleInheritence {
    protected String name;
    protected double balance;

    public SingleInheritence(String name, double balance) {// creating constructor 
        this.name = name;
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println(amount + " deposited. New Balance: " + balance);
    }
}

class SavingsAccount extends SingleInheritence { // Single Inheritance
    private double interestRate;

    public SavingsAccount(String name, double balance, double interestRate) {
        super(name, balance); // super keyword use to call the parent class constructor 
        this.interestRate = interestRate;
    }

    public void applyInterest() {
        double interest = balance * interestRate;
        balance += interest;
        System.out.println("Interest Applied: " + interest + ", New Balance: " + balance);
    }
}

 class SingleInheritanceDemo {
    public static void main(String[] args) {
        SavingsAccount sa = new SavingsAccount("Harshit", 50000, 0.05);
        sa.deposit(5000);
        sa.applyInterest();
    }
}

    

