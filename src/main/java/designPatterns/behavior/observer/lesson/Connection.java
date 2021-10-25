package designPatterns.behavior.observer.lesson;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

class Connection {

    private PropertyChangeSupport propertyChangeSupport = new PropertyChangeSupport(this);

    String status = "";

    void setStatus(String status) {
        propertyChangeSupport.firePropertyChange("status", this.status, status);
        this.status = status;
    }

    void addPropertyChangeListener(PropertyChangeListener listener) {
        propertyChangeSupport.addPropertyChangeListener(listener);
    }
}
