package designPatterns.behavior.template_method.challenge;

public class Troll extends StrangePerson{

  public void pickUpWeapon() {
    System.out.println("Pick up club");
  }

  public void defenseAction() {
    System.out.println("Defend with club");
  }

  public void moveToSafety() {
    System.out.println("Return to the mountain");
  }

}
