package designPatterns.behavior.template_method.challenge;

abstract class StrangePerson {

    public void pickUpWeapon() {
    }

    public void defenseAction() {
    }

    public void moveToSafety() {
    }

    public void defendAgainstAttack() {
        pickUpWeapon();
        defenseAction();
        moveToSafety();
        System.out.println();
    }
}
