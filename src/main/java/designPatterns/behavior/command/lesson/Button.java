package designPatterns.behavior.command.lesson;

public class Button {

    private String name;

    public Button(String name) {
        this.name = name;
    }

    void click(Command command){
        command.execute();
    }
}
