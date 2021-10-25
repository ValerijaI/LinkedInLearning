package designPatterns.behavior.state.lesson;

public class MediaPlayer {

    private State state = new PauseState();
    private String icon = "play button";

    void setState(State state) {
        this.state = state;
    }

    State getState() {
        return state;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    void play() {
        state.play(this);
    }

    void pause() {
        state.pause(this);
    }
}
