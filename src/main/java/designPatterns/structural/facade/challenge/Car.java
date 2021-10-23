package designPatterns.structural.facade.challenge;

public class Car {


  public static void main(String[] args) {

    CarFacade carFacade = new CarFacade();
    carFacade.go();
  }

}
