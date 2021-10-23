package threads;

public class Main {

    public static void main(String args[]) {

//        ThreadExample threadExample1 = new ThreadExample();
//        threadExample1.setName("My first thread");
//        threadExample1.start();
//
//        ThreadExample threadExample2 = new ThreadExample();
//        threadExample2.setName("My second thread");
//        threadExample2.start();

        Thread thread1 = new Thread(new RunnableExample());
        thread1.start();

        Thread thread2 = new Thread(new RunnableExample());
        thread2.start();
    }
}
