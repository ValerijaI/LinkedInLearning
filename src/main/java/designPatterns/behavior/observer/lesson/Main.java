package designPatterns.behavior.observer.lesson;

public class Main {

    public static void main (String [] args) {
        Connection sally = new Connection();
        Connection bob = new Connection();
        SocialMediaFeed socialMediaFeed = new SocialMediaFeed();

        sally.addPropertyChangeListener(socialMediaFeed);
        bob.addPropertyChangeListener(socialMediaFeed);

        sally.setStatus("going for a walk");
        bob.setStatus("eating my lunch");

        socialMediaFeed.printStatuses();
    }
}
