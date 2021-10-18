package designPatterns.bridge.challenge;

public class MediumSize implements ButtonSize{

    @Override
    public void getSize() {
        System.out.println("Setting size to medium...");
    }
}
