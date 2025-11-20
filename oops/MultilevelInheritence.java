package oops;

public class MultilevelInheritence {
    protected String name;
    protected double balance;

    public MultilevelInheritence(String name, double balance) {
        this.name = name;
        this.balance = balance;
    }
}

class SavingsAccountM extends MultilevelInheritence {
    protected double interestRate;

    public SavingsAccountM(String name, double balance, double interestRate) {
        super(name, balance);
        this.interestRate = interestRate;
    }

    public void addInterest() {
        balance += balance * interestRate;
    }
}

class OnlineSavingsAccount extends SavingsAccountM { // Multilevel
    public OnlineSavingsAccount(String name, double balance, double interestRate) {
        super(name, balance, interestRate);
    }

    public void onlineTransfer(double amount) {
        balance -= amount;
        System.out.println("Online transfer successful. Balance: " + balance);
    }
}

 class MultilevelInheritanceDemo {
    public static void main(String[] args) {
        OnlineSavingsAccount acc = new OnlineSavingsAccount("Aman", 70000, 0.06);
        acc.addInterest();
        acc.onlineTransfer(10000);
    }
}

    

