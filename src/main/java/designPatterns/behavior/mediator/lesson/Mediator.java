package designPatterns.behavior.mediator.lesson;

public class Mediator {

    private Customer customer;
    private ECommerceSite eCommerceSite;
    private Driver driver;

    public Mediator() {
        customer = new Customer("123 Sunny Street");
        eCommerceSite = new ECommerceSite();
        driver = new Driver();
    }

    public void buy(String item, int quantity) {
        if (eCommerceSite.checkInStock(item, quantity)) {
            eCommerceSite.sell(item, quantity);
            driver.deliver(item, quantity, customer);
        }
    }
}
