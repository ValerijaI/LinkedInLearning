package designPatterns.bridge.challenge;

public class LargeSize implements ButtonSize {

    @Override
    public void getSize() {
        System.out.println("Setting size to large...");
    }
}
