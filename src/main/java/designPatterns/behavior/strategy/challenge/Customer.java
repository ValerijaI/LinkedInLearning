package designPatterns.behavior.strategy.challenge;

public class Customer {

  void pay(Payment payment, int amount) {
    payment.pay(amount);
  }


}
