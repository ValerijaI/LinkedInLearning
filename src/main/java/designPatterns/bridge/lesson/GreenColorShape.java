package designPatterns.bridge.lesson;

import java.awt.*;

public class GreenColorShape implements ColorShape {

  public void setColor(Graphics graphics) {
    graphics.setColor(Color.GREEN);
  }

}
