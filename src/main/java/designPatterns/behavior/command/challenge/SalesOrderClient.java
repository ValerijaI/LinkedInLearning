package designPatterns.behavior.command.challenge;

public class SalesOrderClient {

  private static Jacket jacket = new Jacket();

  public static void main(String[] args) {

    OrderHandler placeOrderHandler = new OrderHandler("place");
    OrderHandler returnOrderHandler = new OrderHandler("return");

    placeOrderHandler.invoke(new PlaceOrderCommand(jacket));
    returnOrderHandler.invoke(new ReturnOrderCommand(jacket));


  }


}
