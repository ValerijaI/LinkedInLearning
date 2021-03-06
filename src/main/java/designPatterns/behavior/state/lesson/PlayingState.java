package designPatterns.behavior.state.lesson;

public class PlayingState implements State {

    @Override
    public void pause(MediaPlayer mediaPlayer) {
        mediaPlayer.setState(new PlayingState());
        mediaPlayer.setIcon("play button");
        System.out.println("Video paused, icon set to " + mediaPlayer.getIcon());
    }

    @Override
    public void play(MediaPlayer mediaPlayer) {

    }
}
