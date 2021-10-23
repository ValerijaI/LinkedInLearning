package threads;

public class ThreadExample extends Thread {

    @Override
    public void run() {
        for (int i = 1; i < 100; i++) {
            System.out.println(i + " thread name: " + this.getName());
        }
    }
}
