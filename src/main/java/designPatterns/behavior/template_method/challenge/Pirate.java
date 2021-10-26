package designPatterns.behavior.template_method.challenge;

public class Pirate extends StrangePerson{

  public void pickUpWeapon() {
    System.out.println("Pick up sword");
  }

  public void defenseAction() {
    System.out.println("Defend with sword");
  }

  public void moveToSafety() {
    System.out.println("Return to the ship");
  }

}
