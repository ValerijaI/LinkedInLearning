package designPatterns.structural.flyweight.lesson;

public interface Vehicle {

  String getModel();
  void setLocation(int latitude, int longitude);
  int[] getLocation();
}
