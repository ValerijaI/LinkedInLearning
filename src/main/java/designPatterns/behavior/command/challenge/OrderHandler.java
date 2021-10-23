package designPatterns.behavior.command.challenge;

public class OrderHandler {

  private String name;

  public OrderHandler(String name) {
    this.name = name;
  }

  public void invoke(Command command) {
    command.execute();
  }

}
