package designPatterns.behavior.observer.challenge;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

public class City {

  private String trafficUpdate = "";
  private PropertyChangeSupport propertyChangeSupport = new PropertyChangeSupport(this);

  public void updateTraffic(String trafficUpdate) {
    propertyChangeSupport.firePropertyChange("trafficUpdate", this.trafficUpdate, trafficUpdate);
    this.trafficUpdate = trafficUpdate;
  }

  void addPropertyChangeListener(PropertyChangeListener propertyChangeListener) {
    propertyChangeSupport.addPropertyChangeListener(propertyChangeListener);
  }

}
