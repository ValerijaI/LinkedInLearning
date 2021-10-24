package designPatterns.behavior.memento.challenge;

public class Adder {

  private int result;
  private Memento memento = new Memento(result);

  public void add(int newNumber) {
    result += newNumber;
  }

  public void save() {
    memento.setResult(result);
  }

  public void undo() {
    result = memento.getResult();
  }

  public int getResult() {
    return result;
  }

}
