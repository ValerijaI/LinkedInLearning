package designPatterns.behavior.strategy.challenge;

public interface Payment {

    void pay(int amount);

    Payment payWithBankAccount = (int amount) -> System.out.println("Payment of $" + amount + " made from bank account.");

    Payment payWithPayPal = (int amount) -> System.out.println("Payment of $" + amount + " made from PayPal account.");
}
