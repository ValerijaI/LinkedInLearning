package designPatterns.bridge.challenge;

public class SmallSize implements ButtonSize{

    @Override
    public void getSize() {
        System.out.println("Setting size to small...");
    }
}
