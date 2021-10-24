package designPatterns.behavior.memento.challenge;

public class Memento {

    private int result;

    public Memento(int result) {
        this.result = result;
    }

    public int getResult() {
        return result;
    }

    public void setResult(int result) {
        this.result = result;
    }
}
