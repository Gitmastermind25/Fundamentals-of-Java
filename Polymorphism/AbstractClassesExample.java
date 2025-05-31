package Polymorphism;

// Abstract class
abstract class BankAccount {
    abstract void deposit();
    abstract void withdraw();
    abstract void balance();	
}

// Subclass with method overriding
class SavingAccount extends BankAccount {
    private double accountBalance = 0.0;

    @Override
    void deposit() {
        double amount = 1000;  // Simulating deposit
        accountBalance += amount;
        System.out.println("Deposited: " + amount);
    }

    @Override
    void withdraw() {
        double amount = 500;  // Simulating withdrawal
        if (amount <= accountBalance) {
            accountBalance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient balance!");
        }
    }

    @Override
    void balance() {
        System.out.println("Current Balance: " + accountBalance);
    }
}

// Main class
public class AbstractClassesExample {
    public static void main(String[] args) {
        BankAccount acc = new SavingAccount();  // Polymorphism in action

        acc.deposit();   // Calls SavingAccount's deposit
        acc.withdraw();  // Calls SavingAccount's withdraw
        acc.balance();   // Calls SavingAccount's balance
    }
}
