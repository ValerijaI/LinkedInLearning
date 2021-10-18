package designPatterns.bridge.lesson;

import java.awt.*;

public class RedColorShape implements ColorShape {

  public void setColor(Graphics graphics) {
    graphics.setColor(Color.RED);
  }

}
