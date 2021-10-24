package designPatterns.behavior.memento.lesson;

public class TextDocument {

    private String text = "";
    private Memento memento = new Memento(text);

    public void write(String text) {
        this.text = text;
    }

    public void print() {
        System.out.println(text);
    }

    public void saveText() {
        memento.setState(text);
    }

    public void undo() {
        text = memento.getState();
    }
}
