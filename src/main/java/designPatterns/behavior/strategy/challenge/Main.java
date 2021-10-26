package designPatterns.behavior.strategy.challenge;

public class Main {

  public static void main(String[] args) {
    Customer customer = new Customer();
    customer.pay(Payment.payWithBankAccount, 100);
    customer.pay(Payment.payWithPayPal, 100);
  }

}
