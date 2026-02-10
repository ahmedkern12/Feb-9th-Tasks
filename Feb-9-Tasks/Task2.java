class BankAccount {
    private double balance;

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && balance - amount >= 0) {
            balance -= amount;
        }
    }
}

public class Task2 {
    public static void main(String[] args) {
        BankAccount acc = new BankAccount();
        acc.deposit(19472003);
        acc.withdraw(34512);
        System.out.println(String.format("%.0f",acc.getBalance()));
    }
}

//String.format("%.0f")